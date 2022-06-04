package pe.edu.upc.gocareer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Specialist")
public class Specialist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CSpecialist;

	@Column(name = "nameSpecialist", nullable = false, length = 40)
	private String nameSpecialist;

	@Column(name = "lastNameSpecialist", nullable = false, length = 40)
	private String lastNameSpecialist;

	@Column(name = "emailSpecialist", nullable = false, length = 50)
	private String emailSpecialist;

	@Column(name = "cellSpecialist", nullable = false, length = 9)
	private String cellSpecialist;

	@Column(name = "passwordSpecialist", nullable = false, length = 20)
	private String passwordSpecialist;

	@Column(name = "dniSpecialist", nullable = false, length = 8)
	private String dniSpecialist;

	@Column(name = "cpspSpecialist", nullable = false, length = 5)
	private String cpspSpecialist;

	public Specialist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialist(int cSpecialist, String nameSpecialist, String lastNameSpecialist, String emailSpecialist,
			String cellSpecialist, String passwordSpecialist, String dniSpecialist, String cpspSpecialist) {
		super();
		CSpecialist = cSpecialist;
		this.nameSpecialist = nameSpecialist;
		this.lastNameSpecialist = lastNameSpecialist;
		this.emailSpecialist = emailSpecialist;
		this.cellSpecialist = cellSpecialist;
		this.passwordSpecialist = passwordSpecialist;
		this.dniSpecialist = dniSpecialist;
		this.cpspSpecialist = cpspSpecialist;
	}

	public int getCSpecialist() {
		return CSpecialist;
	}

	public void setCSpecialist(int cSpecialist) {
		CSpecialist = cSpecialist;
	}

	public String getNameSpecialist() {
		return nameSpecialist;
	}

	public void setNameSpecialist(String nameSpecialist) {
		this.nameSpecialist = nameSpecialist;
	}

	public String getLastNameSpecialist() {
		return lastNameSpecialist;
	}

	public void setLastNameSpecialist(String lastNameSpecialist) {
		this.lastNameSpecialist = lastNameSpecialist;
	}

	public String getEmailSpecialist() {
		return emailSpecialist;
	}

	public void setEmailSpecialist(String emailSpecialist) {
		this.emailSpecialist = emailSpecialist;
	}

	public String getCellSpecialist() {
		return cellSpecialist;
	}

	public void setCellSpecialist(String cellSpecialist) {
		this.cellSpecialist = cellSpecialist;
	}

	public String getPasswordSpecialist() {
		return passwordSpecialist;
	}

	public void setPasswordSpecialist(String passwordSpecialist) {
		this.passwordSpecialist = passwordSpecialist;
	}

	public String getDniSpecialist() {
		return dniSpecialist;
	}

	public void setDniSpecialist(String dniSpecialist) {
		this.dniSpecialist = dniSpecialist;
	}

	public String getCpspSpecialist() {
		return cpspSpecialist;
	}

	public void setCpspSpecialist(String cpspSpecialist) {
		this.cpspSpecialist = cpspSpecialist;
	}

}
