package pe.edu.upc.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="PreguntaTest")
public class PreguntaTest {
	@EmbeddedId
	PreguntaTestPKID id;
	
	@ManyToOne
	@MapsId("CPregunta")
	@JoinColumn(name = "CPregunta")
	Pregunta pregunta;
	
	@ManyToOne
	@MapsId("CTest")
	@JoinColumn(name = "CTest")
	Test test;

	public PreguntaTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreguntaTest(PreguntaTestPKID id, Pregunta pregunta, Test test) {
		super();
		this.id = id;
		this.pregunta = pregunta;
		this.test = test;
	}

	public PreguntaTestPKID getId() {
		return id;
	}

	public void setId(PreguntaTestPKID id) {
		this.id = id;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
	
}
