package com.javaschedule.beans;

public class EnseignantJobBean {
	private String matiere;
	private String seance;
	private String salle;
	private String materiel;
	public EnseignantJobBean(String matiere, String seance, String salle, String materiel) {
		super();
		this.matiere = matiere;
		this.seance = seance;
		this.salle = salle;
		this.materiel = materiel;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public String getSeance() {
		return seance;
	}
	public void setSeance(String seance) {
		this.seance = seance;
	}
	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	public String getMateriel() {
		return materiel;
	}
	public void setMateriel(String materiel) {
		this.materiel = materiel;
	}
	@Override
	public String toString() {
		return "EnseignantJobBean [matiere=" + matiere + ", seance=" + seance + ", salle=" + salle + ", materiel="
				+ materiel + "]";
	}
	

}
