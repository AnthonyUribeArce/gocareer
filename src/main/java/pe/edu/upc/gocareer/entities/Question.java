package pe.edu.upc.gocareer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CQuestion;
	
	@Column(name = "TDetailQuestion", nullable = false, length = 100)
	@NotEmpty
	private String TDetailQuestion;
	
	@Column(name = "TAnswerQuestion", nullable = false, length = 50)
	@NotEmpty
	private String TAnswerQuestion;
	
	@ManyToOne
	@JoinColumn(name = "CSpecialist", nullable = false)
	private Specialist specialist;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int CQuestion, String TDetailQuestion, String TAnswerQuestion, Specialist specialist) {
		super();
		this.CQuestion = CQuestion;
		this.TDetailQuestion = TDetailQuestion;
		this.TAnswerQuestion = TAnswerQuestion;
		this.specialist = specialist;
	}

	public int getCQuestion() {
		return CQuestion;
	}

	public void setCQuestion(int CQuestion) {
		this.CQuestion = CQuestion;
	}

	public String getTDetailQuestion() {
		return TDetailQuestion;
	}

	public void setTDetailQuestion(String TDetailQuestion) {
		this.TDetailQuestion = TDetailQuestion;
	}

	public String getTAnswerQuestion() {
		return TAnswerQuestion;
	}

	public void setTAnswerQuestion(String TAnswerQuestion) {
		this.TAnswerQuestion = TAnswerQuestion;
	}

	public Specialist getSpecialist() {
		return specialist;
	}

	public void setSpecialist(Specialist specialist) {
		this.specialist = specialist;
	}
	
	
}
