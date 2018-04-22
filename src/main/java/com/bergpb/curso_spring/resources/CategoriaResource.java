package com.bergpb.curso_spring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bergpb.curso_spring.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {

		//instanciando objetos
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");

		//instanciando a lista de categorias
		List<Categoria> listacategoria = new ArrayList<>();
		listacategoria.add(cat1);
		listacategoria.add(cat2);

		//retornando listacategoria em json
		return listacategoria;
	}

}
