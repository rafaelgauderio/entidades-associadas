package com.rafaeldeluca.Entidadesassociadas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaeldeluca.Entidadesassociadas.entities.Product;

public interface ProductInterface extends JpaRepository<Product, Long> {

}
