package com.giovanildo.main;

import com.giovanildo.dao.DAO;
import com.giovanildo.models.PlanoTrabalho;

public class Main {
	public static void main(String[] args) {
		for (PlanoTrabalho daVez : new DAO<PlanoTrabalho>(PlanoTrabalho.class).listaTodos()) {
			daVez.getDescricao();
		}
	}
}
