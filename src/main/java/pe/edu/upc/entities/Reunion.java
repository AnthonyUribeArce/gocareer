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
@Table(name = "Reunion")
public class Reunion {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int idReunion;

	@ManyToOne
	@JoinColumn(name = "CEstudiante", nullable=false)
	private Alumno alumno;
	@ManyToOne
	@JoinColumn(name = "CEspecialista", nullable=false)
	private Especialista especialista;

	@Column(name = "reuFecha", nullable=false)
	private Date reuFecha;
	@Column(name = "reuHora", nullable=false)
	private Date reuHora;

	public int getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Especialista getEspecialista() {
		return especialista;
	}

	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}

	public Date getReuFecha() {
		return reuFecha;
	}

	public void setReuFecha(Date reuFecha) {
		this.reuFecha = reuFecha;
	}

	public Date getReuHora() {
		return reuHora;
	}

	public void setReuHora(Date reuHora) {
		this.reuHora = reuHora;
	}

	public Reunion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reunion(int idReunion, Alumno alumno, Especialista especialista, Date reuFecha, Date reuHora) {
		super();
		this.idReunion = idReunion;
		this.alumno = alumno;
		this.especialista = especialista;
		this.reuFecha = reuFecha;
		this.reuHora = reuHora;
	}

}