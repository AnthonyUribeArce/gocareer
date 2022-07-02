package pe.edu.upc.gocareer.serviceInterface;

import java.util.List;

import pe.edu.upc.gocareer.entity.Users;

public interface IUserService {
	public void insert(Users user);
	List<Users> list();
}
