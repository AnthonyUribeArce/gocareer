package pe.edu.upc.gocareer.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Publication")
public class Publication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CPublication;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "DDatePublication", nullable = false)
	@NotNull
	private Date DDatePublication;
	
	@Column(name = "TContentPublication", nullable = false, length = 250)
	@NotEmpty
	private String TContentPublication;
	
	@ManyToOne
	@JoinColumn(name = "CSpecialist", nullable = false)
	private Specialist Specialist;

	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publication(int CPublication, Date DDatePublication, String TContentPublication, Specialist Specialist) {
		super();
		this.CPublication = CPublication;
		this.DDatePublication = DDatePublication;
		this.TContentPublication = TContentPublication;
		this.Specialist = Specialist;
	}

	public int getCPublication() {
		return CPublication;
	}

	public void setCPublication(int CPublication) {
		this.CPublication = CPublication;
	}

	public Date getDDatePublication() {
		return DDatePublication;
	}

	public void setDDatePublication(Date DDatePublication) {
		this.DDatePublication = DDatePublication;
	}

	public String getTContentPublication() {
		return TContentPublication;
	}

	public void setTContentPublication(String TContentPublication) {
		this.TContentPublication = TContentPublication;
	}

	public Specialist getSpecialist() {
		return Specialist;
	}

	public void setSpecialist(Specialist Specialist) {
		this.Specialist = Specialist;
	}
	
}
