package com.projetjava.basketball.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetjava.basketball.model.Joueur;

@Repository
public interface JoueurDAO extends JpaRepository<Joueur, Integer> {

}
