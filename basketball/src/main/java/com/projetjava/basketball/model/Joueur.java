package com.projetjava.basketball.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq", initialValue=10, allocationSize=100)
public class Joueur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int id;
	private String nom;
	private String position;
	private int No;
	
	
	@ManyToOne
	@JoinColumn(name = "equipe_Id", nullable = true) // je l'ai passé à true pour permettre de ne pas renseigner l'information et lancer l'application malgré tout
	private Equipe equipe;
	
	private double taille;
	private int poid;
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joueur(int id, String nom, String position, int no, Equipe equipe, double taille, int poid) {
		super();
		this.id = id;
		this.nom = nom;
		this.position = position;
		No = no;
		this.equipe = equipe;
		this.taille = taille;
		this.poid = poid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + No;
		result = prime * result + ((equipe == null) ? 0 : equipe.hashCode());
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + poid;
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		long temp;
		temp = Double.doubleToLongBits(taille);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Joueur other = (Joueur) obj;
		if (No != other.No)
			return false;
		if (equipe == null) {
			if (other.equipe != null)
				return false;
		} else if (!equipe.equals(other.equipe))
			return false;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (poid != other.poid)
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (Double.doubleToLongBits(taille) != Double.doubleToLongBits(other.taille))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Joueur [id=" + id + ", nom=" + nom + ", position=" + position + ", No=" + No + ", equipe=" + equipe
				+ ", taille=" + taille + ", poid=" + poid + "]";
	}
	
	

}
