package pe.edu.upc.gocareer.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.gocareer.entity.Student;
import pe.edu.upc.gocareer.repository.IStudentRepository;
import pe.edu.upc.gocareer.serviceInterface.IStudentService;


@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public void insert(Student student) {
		studentRepository.save(student);

	}

	@Override
	public List<Student> list(){
		return studentRepository.findAll();
	}

	@Override
	public void delete(int idStudent) {
		studentRepository.deleteById(idStudent);
	}

	@Override
	public Optional<Student> listId(int idStudent) {
		return studentRepository.findById(idStudent);
	}

	@Override
	public void update(Student student) {
		studentRepository.save(student);

	}

	@Override
	public List<Student> listBusqueda(String palabraClave) {
		if (palabraClave != null) {
			return studentRepository.findTodo(palabraClave);
		}
		return studentRepository.findAll();
	}

}
