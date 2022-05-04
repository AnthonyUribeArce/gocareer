package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pregunta")
public class Pregunta {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int CPregunta;
	@Column(name = "TDetallePregunta" ,nullable = false, length = 200)
	private String TDetallePregunta;
	@Column(name = "TRespuesta" ,nullable = false, length =100)
	private String TRespuesta;
	
	@ManyToOne
	@JoinColumn(name="CEspecialista", nullable = false)
	private Especialista especialista;

	public Pregunta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pregunta(int cPregunta, String tDetallePregunta, String tRespuesta, Especialista especialista) {
		super();
		CPregunta = cPregunta;
		TDetallePregunta = tDetallePregunta;
		TRespuesta = tRespuesta;
		this.especialista = especialista;
	}

	public int getCPregunta() {
		return CPregunta;
	}

	public void setCPregunta(int cPregunta) {
		CPregunta = cPregunta;
	}

	public String getTDetallePregunta() {
		return TDetallePregunta;
	}

	public void setTDetallePregunta(String tDetallePregunta) {
		TDetallePregunta = tDetallePregunta;
	}

	public String getTRespuesta() {
		return TRespuesta;
	}

	public void setTRespuesta(String tRespuesta) {
		TRespuesta = tRespuesta;
	}

	public Especialista getEspecialista() {
		return especialista;
	}

	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}
	
}
