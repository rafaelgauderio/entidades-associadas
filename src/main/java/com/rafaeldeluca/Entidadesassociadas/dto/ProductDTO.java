package com.rafaeldeluca.Entidadesassociadas.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.rafaeldeluca.Entidadesassociadas.entities.Category;
import com.rafaeldeluca.Entidadesassociadas.entities.Product;

public class ProductDTO implements Serializable {	

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double price;	
	private List<CategoryDTO> categories = new ArrayList<CategoryDTO>();
	
	public ProductDTO ()  {
		
	}

	public ProductDTO(Long id, String name, Double price) {		
		this.id = id;
		this.name = name;
		this.price = price;		
	}
	
	public ProductDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.price = entity.getPrice();
		//entity.getCategories().forEach(cat -> this.categories.add(new CategoryDTO(cat)));
		
		// adicionando cada categoria a lista de CategoryDTO
		addCategory(entity.getCategories());	
		
	}
	
	private void addCategory(Set<Category> setCategories) {
		Iterator<Category> categoryIterator = setCategories.iterator();
		while(categoryIterator.hasNext()) {
			this.categories.add(new CategoryDTO(categoryIterator.next()));
		}
		
	}

	/* se fosse uma lista de categorias e não um set*/
	private void addCategory (List<Category> listCat) {
		for(int i=0; listCat.size() > i; i++) {
			this.categories.add(new CategoryDTO(listCat.get(i)));
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}

}
