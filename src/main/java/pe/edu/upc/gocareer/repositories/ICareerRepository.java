package pe.edu.upc.gocareer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.gocareer.entities.Career;

@Repository
public interface ICareerRepository extends JpaRepository<Career, Integer> {

}
