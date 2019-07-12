package com.projetjava.basketball.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetjava.basketball.model.Equipe;

@Repository
public interface EquipeDAO extends JpaRepository<Equipe, Integer> {

}
