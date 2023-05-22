package com.rafaeldeluca.Entidadesassociadas.dto;

import java.io.Serializable;

import com.rafaeldeluca.Entidadesassociadas.entities.QuemicalElement;

public class QuemicalElementDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Integer atomic_number;
	private Long groupId;
	
	public QuemicalElementDTO () {
		
	}

	public QuemicalElementDTO(Long id, String name, Integer atomic_number, Long groupId) {
		
		this.id = id;
		this.name = name;
		this.atomic_number = atomic_number;
		this.groupId = groupId;
	}
	
	public QuemicalElementDTO(QuemicalElement entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.atomic_number = entity.getAtomicNumber();
		this.groupId = entity.getGroup().getId();
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

	public Integer getAtomic_number() {
		return atomic_number;
	}

	public void setAtomic_number(Integer atomic_number) {
		this.atomic_number = atomic_number;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}	
	

}
