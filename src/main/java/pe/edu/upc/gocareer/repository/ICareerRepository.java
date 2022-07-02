package pe.edu.upc.gocareer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.gocareer.entity.Career;


@Repository
public interface ICareerRepository extends JpaRepository<Career, Integer> {

}
