package pe.edu.upc.gocareer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.gocareer.entities.Meeting;

@Repository
public interface IMeetingRepository extends JpaRepository<Meeting, Integer>{

}
