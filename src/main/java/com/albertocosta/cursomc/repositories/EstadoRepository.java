package com.albertocosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.albertocosta.cursomc.domain.Estado;

@Repository
public interface EstadoRepository  extends JpaRepository<Estado, Integer> {

}
