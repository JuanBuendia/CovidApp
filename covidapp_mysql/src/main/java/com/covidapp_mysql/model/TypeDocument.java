package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the documenttype database table.
 * 
 */
@Entity
@Table (name = "tipo_documento")
public class TypeDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL= "TypeDocument.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_tipo_documento")
	private int documentTypeID;

	@Column(name = "descripcion")
	private String description;

	public TypeDocument() {
	}

	public int getDocumentTypeID() {
		return this.documentTypeID;
	}

	public void setDocumentTypeID(int documentTypeID) {
		this.documentTypeID = documentTypeID;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}