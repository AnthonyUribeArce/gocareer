package pe.edu.upc.gocareer.serviceInterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.gocareer.entity.Meeting;


public interface IMeetingService {
	public void insert(Meeting meeting);
	public List<Meeting> list();
	public void delete(int idMeeting);
	Optional<Meeting>listId(int idMeeting);
	public void update(Meeting meeting);
}
