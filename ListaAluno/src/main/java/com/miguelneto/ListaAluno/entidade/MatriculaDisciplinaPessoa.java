package com.miguelneto.ListaAluno.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // classe que representa o banco de dados
public class MatriculaDisciplinaPessoa {

	@Id // Defini o PrimaryKey da Tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // PrimaryKey seja gerado automát
	
	private long id;
	private String nome;
	
	@ManyToOne // chave estrangeira
	private Disciplina disciplina;
	
	@ManyToOne // chave estrangeira
	private Pessoa pessoa;
	
	public MatriculaDisciplinaPessoa() {
    }

    public MatriculaDisciplinaPessoa(Long id, Pessoa pessoa, Disciplina disciplina) {
        this.id = id;
        this.pessoa = pessoa;
        this.disciplina = disciplina;
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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
