package com.treinamento.moduloweb;

import java.sql.Date;

public class Modulo {
	private String nome;
	private String instrutorTitular;
	private String instrutorAuxiliar;
	private Date dataInicio;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstrutorTitular() {
		return instrutorTitular;
	}
	public void setInstrutorTitular(String instrutorTitular) {
		this.instrutorTitular = instrutorTitular;
	}
	public String getInstrutorAuxiliar() {
		return instrutorAuxiliar;
	}
	public void setInstrutorAuxiliar(String instrutorAuxiliar) {
		this.instrutorAuxiliar = instrutorAuxiliar;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


}
