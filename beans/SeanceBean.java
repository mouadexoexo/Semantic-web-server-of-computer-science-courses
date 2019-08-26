package com.javaschedule.beans;


public class SeanceBean {
	private int id_seance;
	private String c_seance;
	private String h_debut;
	private String h_fin;
	private String jour;
	private String type_seance;
	
	public SeanceBean(int id_seance, String c_seance, String h_debut, String h_fin, String jour, String type_seance) {
		super();
		this.id_seance = id_seance;
		this.c_seance = c_seance;
		this.h_debut = h_debut;
		this.h_fin = h_fin;
		this.jour = jour;
		this.type_seance = type_seance;
	}
	public int getId_seance() {
		return id_seance;
	}
	public void setId_seance(int id_seance) {
		this.id_seance = id_seance;
	}
	public String getC_seance() {
		return c_seance;
	}
	public void setC_seance(String c_seance) {
		this.c_seance = c_seance;
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
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public String getType_seance() {
		return type_seance;
	}
	public void setType_seance(String type_seance) {
		this.type_seance = type_seance;
	}
	@Override
	public String toString() {
		return "SeanceBean [id_seance=" + id_seance + ", c_seance=" + c_seance + ", h_debut=" + h_debut + ", h_fin="
				+ h_fin + ", jour=" + jour + ", type_seance=" + type_seance + "]";
	}

	
	
	

}
