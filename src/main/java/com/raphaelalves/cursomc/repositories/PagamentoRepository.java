package com.raphaelalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphaelalves.cursomc.domain.Pagamento;
import com.raphaelalves.cursomc.domain.Produto;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
