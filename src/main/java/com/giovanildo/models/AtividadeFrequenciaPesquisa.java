package com.giovanildo.models;

import java.util.Date;

public class AtividadeFrequenciaPesquisa {
	/**
	 * id
	 */
	private int id;
	private FrequenciaMensal frequenciaMensal;
	private Date dataInicio;
	private Date dataTermino;
	private String descricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public FrequenciaMensal getFrequenciaMensal() {
		return frequenciaMensal;
	}
	public void setFrequenciaMensal(FrequenciaMensal frequenciaMensal) {
		this.frequenciaMensal = frequenciaMensal;
	}
}
