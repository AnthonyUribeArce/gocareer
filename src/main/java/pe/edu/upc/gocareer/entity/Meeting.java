package pe.edu.upc.gocareer.entity;

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
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Meeting")
public class Meeting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CMeeting;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "DDateMeeting", nullable = false)
	@NotNull
	private Date DDateMeeting;
	
	@ManyToOne
	@JoinColumn(name = "CStudent", nullable = false)
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "CSpecialist", nullable = false)
	private Specialist specialist;

	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meeting(int CMeeting, Date DDateMeeting, Student student, Specialist specialist) {
		super();
		this.CMeeting = CMeeting;
		this.DDateMeeting = DDateMeeting;
		this.student = student;
		this.specialist = specialist;
	}

	public int getCMeeting() {
		return CMeeting;
	}

	public void setCMeeting(int CMeeting) {
		this.CMeeting = CMeeting;
	}

	public Date getDDateMeeting() {
		return DDateMeeting;
	}

	public void setDDateMeeting(Date DDateMeeting) {
		this.DDateMeeting = DDateMeeting;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Specialist getSpecialist() {
		return specialist;
	}

	public void setSpecialist(Specialist specialist) {
		this.specialist = specialist;
	}
	
}
