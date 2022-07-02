package pe.edu.upc.gocareer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.gocareer.entity.Student;


@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {

	@Query("SELECT p FROM Student p WHERE p.nameStudent LIKE %?1%" + "OR p.lastNameStudent LIKE %?1%"
			+ "OR p.emailStudent LIKE %?1%" + "OR p.cellStudent LIKE %?1%" + "OR p.birthDateStudent LIKE %?1%")
	public List<Student> findTodo(String palabraClave);
}
