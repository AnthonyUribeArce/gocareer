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
@Table(name = "Publicacion")
public class Publicacion {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int CPublicacion;
	@Column(name = "DFechaPublicacion" ,nullable = false)
	private Date DFechaPublicacion;
	@Column(name = "TContenidoPublicacion" ,nullable = false, length = 500)
	private String TContenidoPublicacion;
	
	@ManyToOne
	@JoinColumn(name="CEspecialista", nullable = false)
	private Especialista especialista;

	public Publicacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publicacion(int cPublicacion, Date dFechaPublicacion, String tContenidoPublicacion,
			Especialista especialista) {
		super();
		CPublicacion = cPublicacion;
		DFechaPublicacion = dFechaPublicacion;
		TContenidoPublicacion = tContenidoPublicacion;
		this.especialista = especialista;
	}

	public int getCPublicacion() {
		return CPublicacion;
	}

	public void setCPublicacion(int cPublicacion) {
		CPublicacion = cPublicacion;
	}

	public Date getDFechaPublicacion() {
		return DFechaPublicacion;
	}

	public void setDFechaPublicacion(Date dFechaPublicacion) {
		DFechaPublicacion = dFechaPublicacion;
	}

	public String getTContenidoPublicacion() {
		return TContenidoPublicacion;
	}

	public void setTContenidoPublicacion(String tContenidoPublicacion) {
		TContenidoPublicacion = tContenidoPublicacion;
	}

	public Especialista getEspecialista() {
		return especialista;
	}

	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}
	
}
