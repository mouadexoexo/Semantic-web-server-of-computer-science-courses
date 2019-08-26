package com.javaschedule.beans;

public class CursusBean {
	private int id_cursus;
	private String c_cursus;
	private String libelle_cursus;
	public CursusBean(int id_cursus, String c_cursus, String libelle_cursus) {
		super();
		this.id_cursus = id_cursus;
		this.c_cursus = c_cursus;
		this.libelle_cursus = libelle_cursus;
	}
	public int getId_cursus() {
		return id_cursus;
	}
	public void setId_cursus(int id_cursus) {
		this.id_cursus = id_cursus;
	}
	public String getC_cursus() {
		return c_cursus;
	}
	public void setC_cursus(String c_cursus) {
		this.c_cursus = c_cursus;
	}
	public String getLibelle_cursus() {
		return libelle_cursus;
	}
	public void setLibelle_cursus(String libelle_cursus) {
		this.libelle_cursus = libelle_cursus;
	}
	@Override
	public String toString() {
		return "CursusBean [id_cursus=" + id_cursus + ", c_cursus=" + c_cursus + ", libelle_cursus=" + libelle_cursus
				+ "]";
	}
	

}
