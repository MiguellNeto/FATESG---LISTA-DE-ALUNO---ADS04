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

import com.miguelneto.ListaAluno.dao.PessoaDao;
import com.miguelneto.ListaAluno.entidade.Pessoa;


@RestController // funcao de ser webservice
@RequestMapping("/pessoa") //para mapear solicitações da web para classes manipuladoras 

public class PessoaRest {
	
	@Autowired // Define pontos de injeção de dependencias dentro de uma classe
	private PessoaDao pessoaDao;
	
	@GetMapping // mapear solicitações HTTP GET
	public List<Pessoa> get(){
		return pessoaDao.findAll();
	}
	
	@PostMapping //mapear solicitações HTTP POST
	public void post(@RequestBody Pessoa pessoa) {
		pessoaDao.save(pessoa); //save altera
	}
	
	@DeleteMapping("/{id}") //mapear solicitações HTTP DELETE
	public void delete(@PathVariable("id") long id) {
		pessoaDao.deleteById(id);
	}
	
	@PutMapping
	public void put(@RequestBody Pessoa pessoa) {
		pessoaDao.save(pessoa);
	}
	

}
