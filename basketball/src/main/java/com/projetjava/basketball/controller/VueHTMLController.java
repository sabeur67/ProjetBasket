package com.projetjava.basketball.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.projetjava.basketball.dao.JoueurDAO;
import com.projetjava.basketball.model.Joueur;

@Controller
public class VueHTMLController {

	@Autowired
	private JoueurDAO joueurDAO;

	@GetMapping(value = "/vue/joueurs")
	public String pageAccueil(Model model) {
		List<Joueur> joueurs = joueurDAO.findAll();
		model.addAttribute("joueurs", joueurs);
		return "Listejoueurs";
	}

	@GetMapping(value = "/vue/joueur/{id}")
	public String produitdetail(Model model, @PathVariable int id) {
		Joueur joueur = joueurDAO.findOne(id);

		model.addAttribute("joueur", joueur);
		return "Listejoueur";
	}

	// on peut aussi afficher les équipe, et fiche équipe
}
