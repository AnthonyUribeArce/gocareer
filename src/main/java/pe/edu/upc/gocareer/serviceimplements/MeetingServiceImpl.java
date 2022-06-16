package pe.edu.upc.gocareer.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.gocareer.entities.Meeting;
import pe.edu.upc.gocareer.repositories.IMeetingRepository;
import pe.edu.upc.gocareer.serviceinterface.IMeetingService;

@Service
public class MeetingServiceImpl implements IMeetingService{

	@Autowired
	private IMeetingRepository mRepository;
	
	@Override
	public void insert(Meeting meeting) {
		mRepository.save(meeting);
	}

	@Override
	public List<Meeting> list() {
		return mRepository.findAll();
	}

	@Override
	public void delete(int idMeeting) {
		mRepository.deleteById(idMeeting);
	}

	@Override
	public void update(Meeting meeting) {
		mRepository.save(meeting);
	}

	@Override
	public Optional<Meeting> listId(int idMeeting) {
		
		return mRepository.findById(idMeeting);
	}

}