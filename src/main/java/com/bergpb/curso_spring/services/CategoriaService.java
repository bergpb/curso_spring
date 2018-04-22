//camada de servicos

package com.bergpb.curso_spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bergpb.curso_spring.domain.Categoria;
import com.bergpb.curso_spring.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	//automaticamente instanciada pelo spring (por injecao de dependencia ou inversao de controle)
	//objeto de acesso a dados
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
		
	}

}
