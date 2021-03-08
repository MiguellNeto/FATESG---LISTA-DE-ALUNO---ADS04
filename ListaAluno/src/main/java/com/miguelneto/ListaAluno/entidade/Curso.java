package com.miguelneto.ListaAluno.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // classe que representa o banco de dados
public class Curso {

	@Id // Defini o PrimaryKey da Tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // PrimaryKey seja gerado automát
	private long id;
	private String nome;


	
	public Curso() {
	}

	public Curso(Long id, String nome) {
		this.id = id;
		this.nome = nome;

	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
