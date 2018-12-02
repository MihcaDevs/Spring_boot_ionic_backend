package com.albertocosta.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.albertocosta.cursomc.domain.Cliente;
import com.albertocosta.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")// recurso categoria - end point - 
public class ClienteResources {
	
	@Autowired
	private ClienteService service;
	
	// Metodo que responde pelo get no recurso categorias retorna lista de categoria
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
		
	}
}
