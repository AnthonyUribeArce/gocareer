package pe.edu.upc.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CarreraTestPKID implements Serializable{
	
	@Column(name="CCarrera")
	int CCarrera;
	@Column(name="CTest")
	int CTest;
	public int getCCarrera() {
		return CCarrera;
	}
	public void setCCarrera(int cCarrera) {
		CCarrera = cCarrera;
	}
	public int getCTest() {
		return CTest;
	}
	public void setCTest(int cTest) {
		CTest = cTest;
	}
	@Override
	public int hashCode() {
		return Objects.hash(CCarrera, CTest);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarreraTestPKID other = (CarreraTestPKID) obj;
		return CCarrera == other.CCarrera && CTest == other.CTest;
	}
	
	
}
