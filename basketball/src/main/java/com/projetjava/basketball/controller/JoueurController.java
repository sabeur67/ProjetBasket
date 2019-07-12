package com.projetjava.basketball.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetjava.basketball.dao.JoueurDAO;
import com.projetjava.basketball.model.Joueur;

@RestController
public class JoueurController {

	@Autowired
	JoueurDAO joueurDAO;

	@GetMapping(value = "/joueurs")
	public List<Joueur> listeDesJoueurs() {
		return joueurDAO.findAll();
	}

	@GetMapping(value = "/joueurs/{id}")
	public Joueur joueurParID(@PathVariable int id) {
		return joueurDAO.findOne(id);
	}

	@PostMapping(value = "/joueurs")
	public void ajouterJoueur(@RequestBody Joueur joueur) {
		joueurDAO.save(joueur);
	}

	@PutMapping(value = "/joueurs")
	public void updateJoueur(@RequestBody Joueur joueur) { // meme nom que dans boulangerie
		joueurDAO.save(joueur);
	}

	@DeleteMapping(value = "/joueurs/deleteAll") // toujours mettre l'élément à supprimer dans la route
	public void deleteAllCities() {
		joueurDAO.deleteAll();
	}

}
