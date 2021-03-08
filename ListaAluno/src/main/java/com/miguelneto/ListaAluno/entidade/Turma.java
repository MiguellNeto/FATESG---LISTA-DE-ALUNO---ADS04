package com.miguelneto.ListaAluno.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // classe que representa o banco de dados
public class Turma {

	@Id // Defini o PrimaryKey da Tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // PrimaryKey seja gerado automát
	
	private long id;
	private String nome;
	
	@ManyToOne // chave estrangeira
	private Curso curso;
	
	public Turma() {
    }

    public Turma(Long id, String nome, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;

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

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
}
