package pe.edu.upc.gocareer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.gocareer.entity.Users;
import pe.edu.upc.gocareer.repository.UserRepository;
import pe.edu.upc.gocareer.serviceInterface.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public void insert(Users user) {
		userRepository.save(user);
		
	}

	@Override
	public List<Users> list() {
		return userRepository.findAll();
	}
	
}
