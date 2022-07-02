package pe.edu.upc.gocareer.serviceInterface;

import java.util.List;

import pe.edu.upc.gocareer.entity.Test;

public interface ITestService {
	public void insert(Test test);
	public List<Test> list();
	public void delete(int idTest);
	public void update(Test test);
}
