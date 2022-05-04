package pe.edu.upc.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "CarreraTest")
public class CarreraTest {
	@EmbeddedId
	CarreraTestPKID id;
	
	@ManyToOne
	@MapsId("CCarrera")
	@JoinColumn(name="CCarrera")
	Carrera carrera;
	
	@ManyToOne
	@MapsId("CTest")
	@JoinColumn(name="CTest")
	Test test;

	public CarreraTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarreraTest(CarreraTestPKID id, Carrera carrera, Test test) {
		super();
		this.id = id;
		this.carrera = carrera;
		this.test = test;
	}

	public CarreraTestPKID getId() {
		return id;
	}

	public void setId(CarreraTestPKID id) {
		this.id = id;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
	
}
