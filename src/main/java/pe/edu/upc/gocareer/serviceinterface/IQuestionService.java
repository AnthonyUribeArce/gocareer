package pe.edu.upc.gocareer.serviceinterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.gocareer.entities.Question;

public interface IQuestionService {
	public void insert(Question question);
	public List<Question> list();
	public void delete(int idQuestion);
	Optional<Question>listId(int idQuestion);
	public void update(Question question);
}
