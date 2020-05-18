package com.giovanildo.models;

import java.util.Collection;
import java.util.Date;

public class FrequenciaMensal {
	private int id;
	private PlanoDeTrabalho plano;
	private SituacaoFrequenciaMensal situacao;
	private Date mesAno;
	private Collection<AtividadeFrequenciaPesquisa> frequencias;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PlanoDeTrabalho getPlano() {
		return plano;
	}

	public void setPlano(PlanoDeTrabalho plano) {
		this.plano = plano;
	}

	public SituacaoFrequenciaMensal getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoFrequenciaMensal situacao) {
		this.situacao = situacao;
	}

	public Date getMesAno() {
		return mesAno;
	}

	public void setMesAno(Date mesAno) {
		this.mesAno = mesAno;
	}

	public Collection<AtividadeFrequenciaPesquisa> getFrequencias() {
		return frequencias;
	}

	public void setFrequencias(Collection<AtividadeFrequenciaPesquisa> frequencias) {
		this.frequencias = frequencias;
	}

}
