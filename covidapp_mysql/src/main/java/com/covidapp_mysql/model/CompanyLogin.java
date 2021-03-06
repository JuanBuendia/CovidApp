package com.covidapp_mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the companylogin database table.
 * 
 */
@Entity
@Table(name = "empresa_login")
public class CompanyLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "EmpresasLogin.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_empresa_login")
	private int companyLoginID;

	@Column(name = "id_empresa")
	private int companyID;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_creacion")
	private Date creationDate;

	@Column(name = "id_login")
	private int loginID;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_cancelacion")
	private Date paymentProDate;

	@Column(name = "estado")
	private int status;

	public CompanyLogin() {
	}

	public int getCompanyLoginID() {
		return this.companyLoginID;
	}

	public void setCompanyLoginID(int companyLoginID) {
		this.companyLoginID = companyLoginID;
	}

	public int getCompanyID() {
		return this.companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getLoginID() {
		return this.loginID;
	}

	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}

	public Date getPaymentProDate() {
		return this.paymentProDate;
	}

	public void setPaymentProDate(Date paymentProDate) {
		this.paymentProDate = paymentProDate;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}