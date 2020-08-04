package com.treinamento.moduloweb.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.treinamento.moduloweb.Modulo;

public class ModuloDAO {
		Connection conn;
		public ModuloDAO(Connection conn) {
			this.conn = conn;
		}

		public List<Modulo> consultarModulos() {
			List<Modulo> listaModulos = new ArrayList();
			
			try (   Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("select ds_nome,ds_instrutor_titular,ds_instrutor_auxiliar,dt_inicio from tb_modulo");) {

				while (rs.next()) {
					Modulo modulo1 = new Modulo();
					modulo1.setNome(rs.getString("ds_nome"));
					modulo1.setInstrutorTitular(rs.getString("ds_instrutor_titular"));
					modulo1.setInstrutorAuxiliar(rs.getString("ds_instrutor_auxiliar"));
					modulo1.setDataInicio(rs.getDate("dt_inicio"));
						
					listaModulos.add(modulo1);
				}

				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			return listaModulos;
		}
	}
	

