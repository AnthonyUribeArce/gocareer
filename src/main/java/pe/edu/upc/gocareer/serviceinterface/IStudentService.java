package pe.edu.upc.gocareer.serviceinterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.gocareer.entities.Student;

public interface IStudentService {

	public void insert(Student student);
	public List<Student> list();
	public void delete(int idStudent);
	Optional<Student>listId(int idStudent);
	public void update(Student student);
}
