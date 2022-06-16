package pe.edu.upc.gocareer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Career")
public class Career {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CCareer;

	@NotEmpty
	@Column(name = "nameCareer", nullable = false, length = 50)
	private String nameCareer;

	public Career() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Career(int cCareer, String nameCareer) {
		super();
		CCareer = cCareer;
		this.nameCareer = nameCareer;
	}

	public int getCCareer() {
		return CCareer;
	}

	public void setCCareer(int cCareer) {
		CCareer = cCareer;
	}

	public String getNameCareer() {
		return nameCareer;
	}

	public void setNameCareer(String nameCareer) {
		this.nameCareer = nameCareer;
	}

}
