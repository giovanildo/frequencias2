package com.giovanildo.models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//@SuppressWarnings("serial")
@Entity
@Table(name = "frequencia_mensal", schema = "pesquisa", uniqueConstraints = {})
public class FrequenciaMensal {
	private int id;
	private PlanoTrabalho plano;
	private Date mesAno;
	private Collection<SituacaoFrequenciaMensal> historicoSituacao;
	private Collection<AtividadePesquisa> frequencias;
	
	
	@Id
	@GeneratedValue
	@Column(name = "id_frequencia_mensal")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_plano_trabalho")
	public PlanoTrabalho getPlano() {
		return plano;
	}

	public void setPlano(PlanoTrabalho plano) {
		this.plano = plano;
	}

	public Date getMesAno() {
		return mesAno;
	}

	public void setMesAno(Date mesAno) {
		this.mesAno = mesAno;
	}

	public FrequenciaMensal() {
		super();
	}
	@OneToMany(mappedBy = "frequenciaMensal", cascade = CascadeType.ALL)
	public Collection<SituacaoFrequenciaMensal> getHistoricoSituacao() {
		return historicoSituacao;
	}

	public void setHistoricoSituacao(Collection<SituacaoFrequenciaMensal> historicoSituacao) {
		this.historicoSituacao = historicoSituacao;
	}
	@OneToMany (mappedBy = "frequenciaMensal")
	public Collection<AtividadePesquisa> getFrequencias() {
		return frequencias;
	}

	public void setFrequencias(Collection<AtividadePesquisa> frequencias) {
		this.frequencias = frequencias;
	}
}
