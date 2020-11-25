package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@Table(name = "departamentos")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Departament.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private int departamentID;

	@Column(name = "nombre_departamento")
	private String name;

	public Department() {
	}

	public int getDepartamentID() {
		return this.departamentID;
	}

	public void setDepartamentID(int departamentID) {
		this.departamentID = departamentID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}