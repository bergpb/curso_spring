package com.bergpb.curso_spring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bergpb.curso_spring.domain.Categoria;
import com.bergpb.curso_spring.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias/")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	//ResponseEntity -> armazena informacoes do servico http para um servico rest
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		//buscando pelo id buscando no servico CategoriaService
		Categoria obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}

}
