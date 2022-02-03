package com.raphaelalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphaelalves.cursomc.domain.Cliente;
import com.raphaelalves.cursomc.domain.Produto;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
