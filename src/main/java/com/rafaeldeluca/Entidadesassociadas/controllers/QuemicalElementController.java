package com.rafaeldeluca.Entidadesassociadas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<QuemicalElementDTO> findElementById (@PathVariable Long id) {
		QuemicalElementDTO dto = service.findElementById(id);
		return ResponseEntity.ok().body(dto);
	}	
	
	@PostMapping
	public ResponseEntity<QuemicalElementDTO> insertElement(@RequestBody QuemicalElementDTO dto) {
		
		dto = service.insertElement(dto);
		return ResponseEntity.ok().body(dto);
		
	}
}
