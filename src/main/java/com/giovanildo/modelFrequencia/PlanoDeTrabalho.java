package com.giovanildo.modelFrequencia;

import java.util.Collection;

public class PlanoDeTrabalho {
	private int id;
	private String descricao;
	private Collection<FrequenciaMensal> frequenciasMensais;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Collection<FrequenciaMensal> getFrequenciasMensais() {
		return frequenciasMensais;
	}

	public void setFrequenciasMensais(Collection<FrequenciaMensal> frequenciasMensais) {
		this.frequenciasMensais = frequenciasMensais;
	}
}
