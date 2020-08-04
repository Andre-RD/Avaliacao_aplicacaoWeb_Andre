package com.treinamento.moduloweb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.treinamento.moduloweb.dao.ConexaoMySqlDAO;
import com.treinamento.moduloweb.dao.ModuloDAO;

@WebServlet("/modulos")
public class ModulosTreinamentoServlet extends HttpServlet {
	public ModulosTreinamentoServlet() {
		System.out.println("Iniciando a nosssa servlet...");
	}
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ConexaoMySqlDAO conexaoMySql = new ConexaoMySqlDAO();
		Connection conn = conexaoMySql.obterConexao();
		
		ModuloDAO moduloDAO = new ModuloDAO(conn);
		List<Modulo> listaModulos = moduloDAO.consultarModulos();

		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		req.setAttribute("modulos", listaModulos);
		
		RequestDispatcher rd = req.getRequestDispatcher("/consultar_modulos.jsp");
		rd.forward(req, resp);
	}

}
