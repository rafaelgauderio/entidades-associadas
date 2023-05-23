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

import com.rafaeldeluca.Entidadesassociadas.dto.ProductDTO;
import com.rafaeldeluca.Entidadesassociadas.services.ProductService;

@RequestMapping(value = "products")
@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAllProduct() {		
		List<ProductDTO> listProducts = service.findAllProducts();
		return ResponseEntity.ok().body(listProducts);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
		ProductDTO dto = service.findProductById(id);
		return ResponseEntity.ok(dto);
	}
	
	@PostMapping
	public ResponseEntity<ProductDTO> insertProduct(@RequestBody ProductDTO dto) {			
		dto = service.insertProduct(dto);
		return ResponseEntity.ok().body(dto);		
	}	
	
}
