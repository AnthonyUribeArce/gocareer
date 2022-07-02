package pe.edu.upc.gocareer.serviceInterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.gocareer.entity.Question;

public interface IQuestionService {
	public void insert(Question question);
	public List<Question> list();
	public void delete(int idQuestion);
	Optional<Question>listId(int idQuestion);
	public void update(Question question);
}
