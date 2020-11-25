package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@Table (name = "personas")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL= "Person.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private int personID;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_de_nacimiento")
	private Date birthday;

	@Column(name = "telefono")
	private BigDecimal cellPhone;

	@Column(name = "id_ciudad")
	private int cityID;

	@Column(name = "documento")
	private String document;

	@Column(name = "tipo_documento")
	private int documentTypeID;

	private String email;

	@Column(name = "primer_nombre")
	private String firstName;

	@Column(name = "genero")
	private String gender;

	@Column(name = "estatura")
	private float height;

	@Column(name = "primer_apellido")
	private String lastName;

	@Column(name = "segundo_apellido")
	private String lastName2;

	@Column(name = "segundo_nombre")
	private String middleName;

	@Column(name = "grupo_sanguineo")
	private String rhBlood;

	@Column(name = "peso")
	private float weight;

	public Person() {
	}

	public int getPersonID() {
		return this.personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public BigDecimal getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(BigDecimal cellPhone) {
		this.cellPhone = cellPhone;
	}

	public int getCityID() {
		return this.cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public String getDocument() {
		return this.document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public int getDocumentTypeID() {
		return this.documentTypeID;
	}

	public void setDocumentTypeID(int documentTypeID) {
		this.documentTypeID = documentTypeID;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName2() {
		return this.lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getRhBlood() {
		return this.rhBlood;
	}

	public void setRhBlood(String rhBlood) {
		this.rhBlood = rhBlood;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}