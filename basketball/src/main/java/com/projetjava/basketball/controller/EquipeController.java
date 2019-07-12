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

import com.projetjava.basketball.dao.EquipeDAO;
import com.projetjava.basketball.model.Equipe;

@RestController
public class EquipeController {

	@Autowired
	EquipeDAO equipeDAO;

	@GetMapping(value = "/equipes")
	public List<Equipe> listeDesEquipes() {
		return equipeDAO.findAll();
	}

	@GetMapping(value = "/equipe/{id}")
	public Equipe equipeParID(@PathVariable int id) {
		return equipeDAO.findOne(id);
	}

	@PostMapping(value = "/equipes")
	public void ajouterEquipe(@RequestBody Equipe equipe) { // le nom de la méthode était ajouterJoueur
		equipeDAO.save(equipe);
	}

	@PutMapping(value = "/equipe")
	public void updateEquipe(@RequestBody Equipe equipe) { // le nom de la méthode est celui du projet boulangerie
		equipeDAO.save(equipe);
	}

	@DeleteMapping(value = "/equipes/deleteAll") // deleteAll est déja présent chez les joueurs, il faut faire
													// /equipe/deleteAll
	public void deleteAllEquipes() {
		equipeDAO.deleteAll();
	}

}
