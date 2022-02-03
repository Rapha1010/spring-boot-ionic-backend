package com.raphaelalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphaelalves.cursomc.domain.Endereco;
import com.raphaelalves.cursomc.domain.Produto;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
