package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Carrera")
public class Carrera {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CCarrera;
	
	@Column(name = "NCarrera", nullable = false, length = 50)
	private String NCarrera;

	public Carrera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carrera(int cCarrera, String nCarrera) {
		super();
		CCarrera = cCarrera;
		NCarrera = nCarrera;
	}

	public int getCCarrera() {
		return CCarrera;
	}

	public void setCCarrera(int cCarrera) {
		CCarrera = cCarrera;
	}

	public String getNCarrera() {
		return NCarrera;
	}

	public void setNCarrera(String nCarrera) {
		NCarrera = nCarrera;
	}

}
