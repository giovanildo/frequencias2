package com.giovanildo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "atividade_pesquisa", schema = "pesquisa", uniqueConstraints = {})
public class AtividadePesquisa {
	/**
	 * id
	 */
	private int id;
	private FrequenciaMensal frequenciaMensal;
	private Date dataInicio;
	private Date dataTermino;
	private String descricao;
	
	@Id
	@GeneratedValue
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
	@ManyToOne
	@JoinColumn(name = "id_frequencia_mensal")
	public FrequenciaMensal getFrequenciaMensal() {
		return frequenciaMensal;
	}
	public void setFrequenciaMensal(FrequenciaMensal frequenciaMensal) {
		this.frequenciaMensal = frequenciaMensal;
	}
}
