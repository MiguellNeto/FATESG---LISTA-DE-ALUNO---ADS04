package com.miguelneto.ListaAluno.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miguelneto.ListaAluno.entidade.Turma;

@Repository
public interface TurmaDao extends JpaRepository<Turma, Long>{

}
