package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CTest;
	@Column(name = "DFechaTest", nullable = false)
	private Date DFechaTest;
	@ManyToOne
	@JoinColumn(name = "CAlumno", nullable = false)
	private Alumno alumno;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(int cTest, Date dFechaTest, Alumno alumno) {
		super();
		CTest = cTest;
		DFechaTest = dFechaTest;
		this.alumno = alumno;
	}
	public int getCTest() {
		return CTest;
	}
	public void setCTest(int cTest) {
		CTest = cTest;
	}
	public Date getDFechaTest() {
		return DFechaTest;
	}
	public void setDFechaTest(Date dFechaTest) {
		DFechaTest = dFechaTest;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
}
