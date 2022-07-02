package pe.edu.upc.gocareer.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.gocareer.entity.Question;
import pe.edu.upc.gocareer.repository.IQuestionRepository;
import pe.edu.upc.gocareer.serviceInterface.IQuestionService;


@Service
public class QuestionServiceImpl implements IQuestionService{

	@Autowired
	private IQuestionRepository qRepository;
	
	@Override
	public void insert(Question question) {
		qRepository.save(question);
	}

	@Override
	public List<Question> list() {
		// TODO Auto-generated method stub
		return qRepository.findAll();
	}

	@Override
	public void delete(int idQuestion) {
		// TODO Auto-generated method stub
		qRepository.deleteById(idQuestion);
	}

	@Override
	public Optional<Question> listId(int idQuestion) {
		// TODO Auto-generated method stub
		return qRepository.findById(idQuestion);
	}

	@Override
	public void update(Question question) {
		// TODO Auto-generated method stub
		qRepository.save(question);
	}

}
