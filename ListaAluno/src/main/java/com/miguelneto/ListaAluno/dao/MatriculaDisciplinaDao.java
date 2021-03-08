package com.miguelneto.ListaAluno.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miguelneto.ListaAluno.entidade.MatriculaDisciplinaPessoa;

@Repository
public interface MatriculaDisciplinaDao extends JpaRepository<MatriculaDisciplinaPessoa,Long> {

}
