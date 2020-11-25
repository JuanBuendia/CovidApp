package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the decree database table.
 * 
 */
@Entity
@Table (name = "decretos")
public class Decree implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Decree.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_decreto")
	private int decreeID;

	@Column(name = "numero_decreto")
	private String decreeNumber;

	@Column(name = "descripcion_decreto")
	private String description;

	public Decree() {
	}

	public int getDecreeID() {
		return this.decreeID;
	}

	public void setDecreeID(int decreeID) {
		this.decreeID = decreeID;
	}

	public String getDecreeNumber() {
		return this.decreeNumber;
	}

	public void setDecreeNumber(String decreeNumber) {
		this.decreeNumber = decreeNumber;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}