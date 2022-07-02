package pe.edu.upc.gocareer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.gocareer.entity.Meeting;


@Repository
public interface IMeetingRepository extends JpaRepository<Meeting, Integer>{

}
