package com.rafaeldeluca.Entidadesassociadas.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaeldeluca.Entidadesassociadas.dto.ProductDTO;
import com.rafaeldeluca.Entidadesassociadas.entities.Category;
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
	
	@Transactional(readOnly = false)
	public ProductDTO insertProduct(ProductDTO dto) {
		
		Product entity = new Product (); 
		entity.setName(dto.getName()); // dto não vai ter parametro id. vai ser autoincrement direto na entidade
		entity.setPrice(dto.getPrice());
		
		// adicionar todos as categorias do dto a entitidade Category
		for(int i=0; dto.getCategories().size() > i ; i++) {
			Category entityCat = new Category();
			entityCat.setId(dto.getCategories().get(i).getId());
			entity.getCategories().add(entityCat);
		}		
		entity = repository.save(entity);		
		return new ProductDTO(entity);	
	}
}

	
