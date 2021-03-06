package com.miguelneto.ListaAluno.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguelneto.ListaAluno.dao.CursoDao;
import com.miguelneto.ListaAluno.entidade.Curso;

@RestController
@RequestMapping("/curso")
public class CursoRest {

	@Autowired
	private CursoDao cursoDao;
	
	@GetMapping
	public List<Curso> get() {
		return cursoDao.findAll(); 
	}
	
	@PostMapping
	public void post(@RequestBody Curso curso) {
		cursoDao.save(curso);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		cursoDao.deleteById(id);
	}
	
	@PutMapping
	public void put(@RequestBody Curso curso) {
		cursoDao.save(curso);
	}
	
	
}

