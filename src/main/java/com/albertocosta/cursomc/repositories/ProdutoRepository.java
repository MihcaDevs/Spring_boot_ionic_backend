package com.albertocosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.albertocosta.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Integer> {

}
