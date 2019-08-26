package com.javaschedule.beans;

public class EtudiantBean extends PersonneBean{
	private String cne;
	private String apogee;
	
	public EtudiantBean(int id, String nom, String prenom, String cin, String tel, String adresse, String email,
			String departement, String sexe, String cne, String apogee) {
		super(id, nom, prenom, cin, tel, adresse, email, departement, sexe);
		this.cne = cne;
		this.apogee = apogee;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getApogee() {
		return apogee;
	}

	public void setApogee(String apogee) {
		this.apogee = apogee;
	}

	@Override
	public String toString() {
		return "EtudiantBean [cne=" + cne + ", apogee=" + apogee + "]";
	}
	
	
	

}
