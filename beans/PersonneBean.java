package com.javaschedule.beans;

public class PersonneBean {
	protected int id;
	protected String nom;
	protected String prenom;
	protected String cin;
	protected String tel;
	protected String adresse;
	protected String email;
	protected String departement;
	protected String sexe;
	
	public PersonneBean(int id, String nom, String prenom, String cin, String tel, String adresse, String email,
			String departement, String sexe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.tel = tel;
		this.adresse = adresse;
		this.email = email;
		this.departement = departement;
		this.sexe = sexe;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	@Override
	public String toString() {
		return "PersonneBean [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", tel=" + tel
				+ ", adresse=" + adresse + ", email=" + email + ", departement=" + departement + ", sexe=" + sexe + "]";
	}
	
		


}
