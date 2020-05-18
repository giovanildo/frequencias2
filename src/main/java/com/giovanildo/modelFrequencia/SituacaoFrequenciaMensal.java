package com.giovanildo.modelFrequencia;

import java.util.Date;

public class SituacaoFrequenciaMensal {
	private int id;	
	private FrequenciaMensal frequenciaMensal;
	private Situacao situacao;
	private Date data;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public FrequenciaMensal getFrequenciaMensal() {
		return frequenciaMensal;
	}
	public void setFrequenciaMensal(FrequenciaMensal frequenciaMensal) {
		this.frequenciaMensal = frequenciaMensal;
	}
}
