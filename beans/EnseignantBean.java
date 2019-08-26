package com.javaschedule.beans;

public class EnseignantBean extends PersonneBean {
	
	private String password;

	public EnseignantBean(int id, String nom, String prenom, String cin, String tel, String adresse, String email,
			String departement, String sexe, String password) {
		super(id, nom, prenom, cin, tel, adresse, email, departement, sexe);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EnseignantBean [password=" + password + "]";
	}
	
	


}
