package pe.edu.upc.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PreguntaTestPKID implements Serializable{

	@Column(name="CPregunta")
	int CPregunta;
	@Column(name="CTest")
	int CTest;
	public int getCPregunta() {
		return CPregunta;
	}
	public void setCPregunta(int cPregunta) {
		CPregunta = cPregunta;
	}
	public int getCTest() {
		return CTest;
	}
	public void setCTest(int cTest) {
		CTest = cTest;
	}
	@Override
	public int hashCode() {
		return Objects.hash(CPregunta, CTest);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PreguntaTestPKID other = (PreguntaTestPKID) obj;
		return CPregunta == other.CPregunta && CTest == other.CTest;
	}
	
}
