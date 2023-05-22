package com.rafaeldeluca.Entidadesassociadas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaeldeluca.Entidadesassociadas.entities.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{

}
