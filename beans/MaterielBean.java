package com.javaschedule.beans;

public class MaterielBean {
	private int id_materiel;
	private String c_materiel;
	private String libelle_materiel;
	public MaterielBean(int id_materiel, String c_materiel, String libelle_materiel) {
		super();
		this.id_materiel = id_materiel;
		this.c_materiel = c_materiel;
		this.libelle_materiel = libelle_materiel;
	}
	public int getId_materiel() {
		return id_materiel;
	}
	public void setId_materiel(int id_materiel) {
		this.id_materiel = id_materiel;
	}
	public String getC_materiel() {
		return c_materiel;
	}
	public void setC_materiel(String c_materiel) {
		this.c_materiel = c_materiel;
	}
	public String getLibelle_materiel() {
		return libelle_materiel;
	}
	public void setLibelle_materiel(String libelle_materiel) {
		this.libelle_materiel = libelle_materiel;
	}
	@Override
	public String toString() {
		return "MaterielBean [id_materiel=" + id_materiel + ", c_materiel=" + c_materiel + ", libelle_materiel="
				+ libelle_materiel + "]";
	}
	
	
}
