package com.miguelneto.ListaAluno.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miguelneto.ListaAluno.entidade.Curso;

@Repository //com o extends JpaRepository vem com varios métodos pronto que faz o crud funcionar
public interface CursoDao extends JpaRepository<Curso, Long>{

}
