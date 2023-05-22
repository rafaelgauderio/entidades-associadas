package com.rafaeldeluca.Entidadesassociadas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaeldeluca.Entidadesassociadas.entities.Category;

@Repository
public interface CategoryInterface extends JpaRepository<Category, Long>{	

}
