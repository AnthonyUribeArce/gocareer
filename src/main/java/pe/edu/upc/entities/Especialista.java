package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Especialista")
public class Especialista {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CEspecialista;
	
	@Column(name = "NNombreEspecialista", nullable = false, length = 20)
	private String NNombreEspecialista;
	
	@Column(name = "NApellidosEspecialista", nullable = false, length = 35)
	private String NApellidosEspecialista;
	
	@Column(name = "TCorreoEspecialista", nullable = false, length = 50)
	private String TCorreoEspecialista;
	
	@Column(name = "NTelefonoEspecialista", nullable = false, length = 15)
	private String NTelefonoEspecialista;
	
	@Column(name = "NDNIEspecialista", nullable = false, length = 10)
	private String NDNIEspecialista;

	public Especialista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Especialista(int cEspecialista, String nNombreEspecialista, String nApellidosEspecialista,
			String tCorreoEspecialista, String nTelefonoEspecialista, String nDNIEspecialista) {
		super();
		CEspecialista = cEspecialista;
		NNombreEspecialista = nNombreEspecialista;
		NApellidosEspecialista = nApellidosEspecialista;
		TCorreoEspecialista = tCorreoEspecialista;
		NTelefonoEspecialista = nTelefonoEspecialista;
		NDNIEspecialista = nDNIEspecialista;
	}

	public int getCEspecialista() {
		return CEspecialista;
	}

	public void setCEspecialista(int cEspecialista) {
		CEspecialista = cEspecialista;
	}

	public String getNNombreEspecialista() {
		return NNombreEspecialista;
	}

	public void setNNombreEspecialista(String nNombreEspecialista) {
		NNombreEspecialista = nNombreEspecialista;
	}

	public String getNApellidosEspecialista() {
		return NApellidosEspecialista;
	}

	public void setNApellidosEspecialista(String nApellidosEspecialista) {
		NApellidosEspecialista = nApellidosEspecialista;
	}

	public String getTCorreoEspecialista() {
		return TCorreoEspecialista;
	}

	public void setTCorreoEspecialista(String tCorreoEspecialista) {
		TCorreoEspecialista = tCorreoEspecialista;
	}

	public String getNTelefonoEspecialista() {
		return NTelefonoEspecialista;
	}

	public void setNTelefonoEspecialista(String nTelefonoEspecialista) {
		NTelefonoEspecialista = nTelefonoEspecialista;
	}

	public String getNDNIEspecialista() {
		return NDNIEspecialista;
	}

	public void setNDNIEspecialista(String nDNIEspecialista) {
		NDNIEspecialista = nDNIEspecialista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CEspecialista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especialista other = (Especialista) obj;
		return CEspecialista == other.CEspecialista;
	}

}
