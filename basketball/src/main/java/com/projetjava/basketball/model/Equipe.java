package com.projetjava.basketball.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq", initialValue=10, allocationSize=100)
public class Equipe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int equipeId;
	private String nom;
	private String localisations;
	private String division;
	private int creation;
	private String logo;
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipe(int equipeId, String nom, String localisations, String division, int creation, String logo) {
		super();
		this.equipeId = equipeId;
		this.nom = nom;
		this.localisations = localisations;
		this.division = division;
		this.creation = creation;
		this.logo = logo;
	}
	public int getEquipeId() {
		return equipeId;
	}
	public void setEquipeId(int equipeId) {
		this.equipeId = equipeId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLocalisations() {
		return localisations;
	}
	public void setLocalisations(String localisations) {
		this.localisations = localisations;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public int getCreation() {
		return creation;
	}
	public void setCreation(int creation) {
		this.creation = creation;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + creation;
		result = prime * result + ((division == null) ? 0 : division.hashCode());
		result = prime * result + equipeId;
		result = prime * result + ((localisations == null) ? 0 : localisations.hashCode());
		result = prime * result + ((logo == null) ? 0 : logo.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Equipe other = (Equipe) obj;
		if (creation != other.creation)
			return false;
		if (division == null) {
			if (other.division != null)
				return false;
		} else if (!division.equals(other.division))
			return false;
		if (equipeId != other.equipeId)
			return false;
		if (localisations == null) {
			if (other.localisations != null)
				return false;
		} else if (!localisations.equals(other.localisations))
			return false;
		if (logo == null) {
			if (other.logo != null)
				return false;
		} else if (!logo.equals(other.logo))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Equipe [equipeId=" + equipeId + ", nom=" + nom + ", localisations=" + localisations + ", division="
				+ division + ", creation=" + creation + ", logo=" + logo + "]";
	}
	
	
	
	
	
	
	
}
