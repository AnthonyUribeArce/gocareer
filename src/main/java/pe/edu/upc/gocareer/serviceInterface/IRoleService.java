package pe.edu.upc.gocareer.serviceInterface;

import java.util.List;

import pe.edu.upc.gocareer.entity.Role;

public interface IRoleService {
	public void insert(Role r);
	List<Role> list();
}
