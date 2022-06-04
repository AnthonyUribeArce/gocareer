package pe.edu.upc.gocareer.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CStudent;

	@Column(name = "nameStudent", nullable = false, length = 40)
	private String nameStudent;

	@Column(name = "lastNameStudent", nullable = false, length = 40)
	private String lastNameStudent;

	@Column(name = "emailStudent", nullable = false, length = 50)
	private String emailStudent;

	@Column(name = "cellStudent", nullable = false, length = 9)
	private String cellStudent;

	@Column(name = "passwordStudent", nullable = false, length = 20)
	private String passwordStudent;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "birthDateStudent", nullable = false)
	private Date birthDateStudent;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int cStudent, String nameStudent, String lastNameStudent, String emailStudent, String cellStudent,
			String passwordStudent, Date birthDateStudent) {
		super();
		CStudent = cStudent;
		this.nameStudent = nameStudent;
		this.lastNameStudent = lastNameStudent;
		this.emailStudent = emailStudent;
		this.cellStudent = cellStudent;
		this.passwordStudent = passwordStudent;
		this.birthDateStudent = birthDateStudent;
	}

	public int getCStudent() {
		return CStudent;
	}

	public void setCStudent(int cStudent) {
		CStudent = cStudent;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public String getLastNameStudent() {
		return lastNameStudent;
	}

	public void setLastNameStudent(String lastNameStudent) {
		this.lastNameStudent = lastNameStudent;
	}

	public String getEmailStudent() {
		return emailStudent;
	}

	public void setEmailStudent(String emailStudent) {
		this.emailStudent = emailStudent;
	}

	public String getCellStudent() {
		return cellStudent;
	}

	public void setCellStudent(String cellStudent) {
		this.cellStudent = cellStudent;
	}

	public Date getBirthDateStudent() {
		return birthDateStudent;
	}

	public void setBirthDateStudent(Date birthDateStudent) {
		this.birthDateStudent = birthDateStudent;
	}

	public String getPasswordStudent() {
		return passwordStudent;
	}

	public void setPasswordStudent(String passwordStudent) {
		this.passwordStudent = passwordStudent;
	}
	

}