package com.javaschedule.beans;

public class MatiereBean {
	private int id_matiere;
	private String c_matiere;
	private String libelle_matiere;
	public MatiereBean(int id_matiere, String c_matiere, String libelle_matiere) {
		super();
		this.id_matiere = id_matiere;
		this.c_matiere = c_matiere;
		this.libelle_matiere = libelle_matiere;
	}
	public int getId_matiere() {
		return id_matiere;
	}
	public void setId_matiere(int id_matiere) {
		this.id_matiere = id_matiere;
	}
	public String getC_matiere() {
		return c_matiere;
	}
	public void setC_matiere(String c_matiere) {
		this.c_matiere = c_matiere;
	}
	public String getLibelle_matiere() {
		return libelle_matiere;
	}
	public void setLibelle_matiere(String libelle_matiere) {
		this.libelle_matiere = libelle_matiere;
	}
	@Override
	public String toString() {
		return "MatiereBean [id_matiere=" + id_matiere + ", c_matiere=" + c_matiere + ", libelle_matiere="
				+ libelle_matiere + "]";
	}
	
	
}
