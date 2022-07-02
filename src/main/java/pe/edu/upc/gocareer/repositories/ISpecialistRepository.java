package pe.edu.upc.gocareer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.gocareer.entities.Specialist;

@Repository
public interface ISpecialistRepository extends JpaRepository<Specialist, Integer> {
	@Query(value = "select sp.name_specialist, count(p.cpublication), (select max(p1.ddate_publication) from publication p1 join specialist sp1 on sp1.cspecialist=p1.cspecialist where sp1.name_specialist=sp.name_specialist)\r\n"
			+ "from specialist sp join publication p\r\n"
			+ "on p.cspecialist=sp.cspecialist\r\n"
			+ "group by sp.name_specialist\r\n"
			+ "order by 1 asc", nativeQuery = true)
	List<String[]> reporte2();
	
	@Query(value = "select sp.name_specialist, count(q.cquestion)\r\n"
			+ "from specialist sp join question q\r\n"
			+ "on q.cspecialist=sp.cspecialist\r\n"
			+ "group by sp.name_specialist\r\n"
			+ "order by 1 asc", nativeQuery = true)
	List<String[]> reporte3();
}
