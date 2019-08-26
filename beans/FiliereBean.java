package com.javaschedule.beans;

public class FiliereBean {
	private int id_filiere;
	private String c_filiere;
	private String libelle_filiere;
	public FiliereBean(int id_filiere, String c_filiere, String libelle_filiere) {
		super();
		this.id_filiere = id_filiere;
		this.c_filiere = c_filiere;
		this.libelle_filiere = libelle_filiere;
	}
	public int getId_filiere() {
		return id_filiere;
	}
	public void setId_filiere(int id_filiere) {
		this.id_filiere = id_filiere;
	}
	public String getC_filiere() {
		return c_filiere;
	}
	public void setC_filiere(String c_filiere) {
		this.c_filiere = c_filiere;
	}
	public String getLibelle_filiere() {
		return libelle_filiere;
	}
	public void setLibelle_filiere(String libelle_filiere) {
		this.libelle_filiere = libelle_filiere;
	}
	@Override
	public String toString() {
		return "FiliereBean [id_filiere=" + id_filiere + ", c_filiere=" + c_filiere + ", libelle_filiere="
				+ libelle_filiere + "]";
	}
	

}
