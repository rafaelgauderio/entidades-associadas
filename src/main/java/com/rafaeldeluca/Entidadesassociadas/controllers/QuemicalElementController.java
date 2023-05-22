package com.rafaeldeluca.Entidadesassociadas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaeldeluca.Entidadesassociadas.dto.QuemicalElementDTO;
import com.rafaeldeluca.Entidadesassociadas.services.QuemicalElementService;

@RestController
@RequestMapping(value = "elements")
public class QuemicalElementController {

	@Autowired
	private QuemicalElementService service;
	
	@GetMapping
	public ResponseEntity<List<QuemicalElementDTO>> findAllElements () {
		List<QuemicalElementDTO> listElements = service.findAll();
		return ResponseEntity.ok().body(listElements);
	}
	
}
