package pe.edu.upc.gocareer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.gocareer.entity.Role;
import pe.edu.upc.gocareer.repository.IRoleRepository;
import pe.edu.upc.gocareer.serviceInterface.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private IRoleRepository roleRepository;

	@Override
	public void insert(Role role) {
		roleRepository.save(role);

	}

	@Override
	public List<Role> list() {

		return roleRepository.findAll();
	}

}
