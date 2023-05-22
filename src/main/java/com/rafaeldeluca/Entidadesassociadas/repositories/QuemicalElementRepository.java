package com.rafaeldeluca.Entidadesassociadas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaeldeluca.Entidadesassociadas.entities.QuemicalElement;

@Repository
public interface QuemicalElementRepository extends JpaRepository<QuemicalElement, Long>{

}
