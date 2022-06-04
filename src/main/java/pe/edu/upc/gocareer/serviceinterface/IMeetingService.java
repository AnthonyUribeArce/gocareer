package pe.edu.upc.gocareer.serviceinterface;

import java.util.List;

import pe.edu.upc.gocareer.entities.Meeting;

public interface IMeetingService {
	public void insert(Meeting meeting);
	public List<Meeting> list();
	public void delete(int idMeeting);
	public void update(Meeting meeting);
}
