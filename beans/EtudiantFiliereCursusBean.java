package com.javaschedule.beans;

public class EtudiantFiliereCursusBean {
	private EtudiantBean etudiant;
	private String filiere;
	private String cursus;
	public EtudiantFiliereCursusBean(EtudiantBean etudiant, String filiere, String cursus) {
		super();
		this.etudiant = etudiant;
		this.filiere = filiere;
		this.cursus = cursus;
	}
	public EtudiantBean getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(EtudiantBean etudiant) {
		this.etudiant = etudiant;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getCursus() {
		return cursus;
	}
	public void setCursus(String cursus) {
		this.cursus = cursus;
	}
	@Override
	public String toString() {
		return "EtudiantFiliereCursusBean [etudiant=" + etudiant + ", filiere=" + filiere + ", cursus=" + cursus + "]";
	}
	
	

}
