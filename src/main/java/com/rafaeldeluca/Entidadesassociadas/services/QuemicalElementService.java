package com.rafaeldeluca.Entidadesassociadas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaeldeluca.Entidadesassociadas.dto.QuemicalElementDTO;
import com.rafaeldeluca.Entidadesassociadas.entities.QuemicalElement;
import com.rafaeldeluca.Entidadesassociadas.repositories.QuemicalElementRepository;

@Service
public class QuemicalElementService {
	
	@Autowired
	private QuemicalElementRepository repository;
	
	@Transactional(readOnly = true)
	public List<QuemicalElementDTO> findAll () {	
		
		List<QuemicalElement> listElements = repository.findAll();
		return listElements.stream().map(x -> new QuemicalElementDTO(x)).collect(Collectors.toList());	
				
	}

}
