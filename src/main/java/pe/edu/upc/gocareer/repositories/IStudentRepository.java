package pe.edu.upc.gocareer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.gocareer.entities.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
	@Query(value = "select st.name_student, sp.name_specialist, count(m.cmeeting), (select sum(citas) from fn_rep1_1(st.name_student))\r\n"
			+ "from student st join meeting m\r\n"
			+ "on m.cstudent=st.cstudent\r\n"
			+ "join specialist sp\r\n"
			+ "on m.cspecialist=sp.cspecialist\r\n"
			+ "group by st.name_student, sp.name_specialist\r\n"
			+ "having count(m.cmeeting) >= all(select citas from fn_rep1_1 (st.name_student))\r\n"
			+ "order by 1 asc", nativeQuery = true)
	List<String[]> reporte1();
}
