package com.albertocosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.albertocosta.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {
	
	

}
