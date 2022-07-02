package pe.edu.upc.gocareer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.gocareer.entity.Publication;


@Repository
public interface IPublicationRepository extends JpaRepository<Publication, Integer>{

}
