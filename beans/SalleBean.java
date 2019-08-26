package com.javaschedule.beans;


public class SalleBean {
	private String id_salle;
	private String c_salle;
	private String type_salle;
	public SalleBean(String id_salle, String c_salle, String type_salle) {
		super();
		this.id_salle = id_salle;
		this.c_salle = c_salle;
		this.type_salle = type_salle;
	}
	public String getId_salle() {
		return id_salle;
	}
	public void setId_salle(String id_salle) {
		this.id_salle = id_salle;
	}
	public String getC_salle() {
		return c_salle;
	}
	public void setC_salle(String c_salle) {
		this.c_salle = c_salle;
	}
	public String getType_salle() {
		return type_salle;
	}
	public void setType_salle(String type_salle) {
		this.type_salle = type_salle;
	}
	@Override
	public String toString() {
		return "SalleBean [id_salle=" + id_salle + ", c_salle=" + c_salle + ", type_salle=" + type_salle + "]";
	}
	
}
