package com.miguelneto.ListaAluno.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miguelneto.ListaAluno.entidade.Disciplina;

@Repository
public interface DisciplinaDao  extends JpaRepository<Disciplina, Long>{

}
