package com.albertocosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.albertocosta.cursomc.domain.Categoria;
import com.albertocosta.cursomc.domain.Pagamento;

@Repository
public interface PagamentoRepository  extends JpaRepository<Pagamento, Integer> {

}
