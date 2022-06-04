package pe.edu.upc.gocareer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.gocareer.entities.Specialist;

@Repository
public interface ISpecialistRepository extends JpaRepository<Specialist, Integer> {

}
