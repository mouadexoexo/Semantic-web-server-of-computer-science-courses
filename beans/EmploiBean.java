package com.javaschedule.beans;

public class EmploiBean {
	
	private String jour;
	private String h_debut;
	private String h_fin;
	private String seance;
	private String type_seance;
	private String salle;
	private String type_salle;
	private String libelle_matiere;
	private String c_matiere;
	private String nom;
	public EmploiBean(String jour, String h_debut, String h_fin, String seance, String type_seance, String salle,
			String type_salle, String libelle_matiere, String c_matiere, String nom) {
		super();
		this.jour = jour;
		this.h_debut = h_debut;
		this.h_fin = h_fin;
		this.seance = seance;
		this.type_seance = type_seance;
		this.salle = salle;
		this.type_salle = type_salle;
		this.libelle_matiere = libelle_matiere;
		this.c_matiere = c_matiere;
		this.nom = nom;
	}
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public String getH_debut() {
		return h_debut;
	}
	public void setH_debut(String h_debut) {
		this.h_debut = h_debut;
	}
	public String getH_fin() {
		return h_fin;
	}
	public void setH_fin(String h_fin) {
		this.h_fin = h_fin;
	}
	public String getSeance() {
		return seance;
	}
	public void setSeance(String seance) {
		this.seance = seance;
	}
	public String getType_seance() {
		return type_seance;
	}
	public void setType_seance(String type_seance) {
		this.type_seance = type_seance;
	}
	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	public String getType_salle() {
		return type_salle;
	}
	public void setType_salle(String type_salle) {
		this.type_salle = type_salle;
	}
	public String getLibelle_matiere() {
		return libelle_matiere;
	}
	public void setLibelle_matiere(String libelle_matiere) {
		this.libelle_matiere = libelle_matiere;
	}
	public String getC_matiere() {
		return c_matiere;
	}
	public void setC_matiere(String c_matiere) {
		this.c_matiere = c_matiere;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "EmploiBean [jour=" + jour + ", h_debut=" + h_debut + ", h_fin=" + h_fin + ", seance=" + seance
				+ ", type_seance=" + type_seance + ", salle=" + salle + ", type_salle=" + type_salle
				+ ", libelle_matiere=" + libelle_matiere + ", c_matiere=" + c_matiere + ", nom=" + nom + "]";
	}
	
	
	

}
