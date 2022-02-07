package com.raphaelalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphaelalves.cursomc.domain.Categoria;
import com.raphaelalves.cursomc.domain.Cliente;
import com.raphaelalves.cursomc.repositories.CategoriaRepository;
import com.raphaelalves.cursomc.repositories.ClienteRepository;
import com.raphaelalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
