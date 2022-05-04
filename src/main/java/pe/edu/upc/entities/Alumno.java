package pe.edu.upc.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Alumno")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CEstudiante;
	
	@Column(name = "NNombresEstudiante", nullable = false, length = 20)
	private String NNombresEstudiante;
	
	@Column(name = "NApellidosEstudiante", nullable = false, length = 35)
	private String NApellidosEstudiante;
	
	@Column(name = "TCorreoEstudiante", nullable = false, length = 50)
	private String TCorreoEstudiante;
	
	@Column(name = "NTelefonoEstudiante", nullable = false, length = 15)
	private String NTelefonoEstudiante;
	
	@Column(name = "DCumpleanios", nullable = false)
	private Date DCumpleanios;

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(int CEstudiante, String NNombresEstudiante, String NApellidosEstudiante, String TCorreoEstudiante,
			String NTelefonoEstudiante, Date DCumpleanios) {
		super();
		this.CEstudiante = CEstudiante;
		this.NNombresEstudiante = NNombresEstudiante;
		this.NApellidosEstudiante = NApellidosEstudiante;
		this.TCorreoEstudiante = TCorreoEstudiante;
		this.NTelefonoEstudiante = NTelefonoEstudiante;
		this.DCumpleanios = DCumpleanios;
	}

	public int getCEstudiante() {
		return CEstudiante;
	}

	public void setCEstudiante(int CEstudiante) {
		this.CEstudiante = CEstudiante;
	}

	public String getNNombresEstudiante() {
		return NNombresEstudiante;
	}

	public void setNNombresEstudiante(String NNombresEstudiante) {
		this.NNombresEstudiante = NNombresEstudiante;
	}

	public String getNApellidosEstudiante() {
		return NApellidosEstudiante;
	}

	public void setNApellidosEstudiante(String NApellidosEstudiante) {
		this.NApellidosEstudiante = NApellidosEstudiante;
	}

	public String getTCorreoEstudiante() {
		return TCorreoEstudiante;
	}

	public void setTCorreoEstudiante(String TCorreoEstudiante) {
		this.TCorreoEstudiante = TCorreoEstudiante;
	}

	public String getNTelefonoEstudiante() {
		return NTelefonoEstudiante;
	}

	public void setNTelefonoEstudiante(String NTelefonoEstudiante) {
		this.NTelefonoEstudiante = NTelefonoEstudiante;
	}

	public Date getDCumpleanios() {
		return DCumpleanios;
	}

	public void setDCumpleanios(Date DCumpleanios) {
		this.DCumpleanios = DCumpleanios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CEstudiante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return CEstudiante == other.CEstudiante;
	}

}
