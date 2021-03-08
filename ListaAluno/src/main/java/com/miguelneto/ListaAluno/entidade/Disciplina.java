package com.miguelneto.ListaAluno.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // classe que representa o banco de dados
public class Disciplina {

	@Id // Defini o PrimaryKey da Tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // PrimaryKey seja gerado automát
	
	private long id;
	private String nome;
	
	@ManyToOne // chave estrangeira
	private Turma turma;
	
	public Disciplina() {
    }

    public Disciplina(Long id, String nome, Turma turma) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
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

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
    
    
	
}
