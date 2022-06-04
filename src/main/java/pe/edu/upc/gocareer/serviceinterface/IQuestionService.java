package pe.edu.upc.gocareer.serviceinterface;

import java.util.List;

import pe.edu.upc.gocareer.entities.Question;

public interface IQuestionService {
	public void insert(Question question);
	public List<Question> list();
	public void delete(int idQuestion);
	public void update(Question question);
}
