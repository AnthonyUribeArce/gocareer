package pe.edu.upc.gocareer.serviceinterface;

import java.util.List;

import pe.edu.upc.gocareer.entities.Test;

public interface ITestService {
	public void insert(Test test);
	public List<Test> list();
	public void delete(int idTest);
	public void update(Test test);
}
