package com.rafaeldeluca.Entidadesassociadas.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaeldeluca.Entidadesassociadas.dto.ProductDTO;
import com.rafaeldeluca.Entidadesassociadas.entities.Product;
import com.rafaeldeluca.Entidadesassociadas.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAllProducts () {
		List <Product> listProducts = repository.findAll();
		return listProducts.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ProductDTO findProductById(Long id) {
		Optional<Product> optional = repository.findById(id);
		Product entity = optional.get();
		return new ProductDTO(entity);
	}
}

	
