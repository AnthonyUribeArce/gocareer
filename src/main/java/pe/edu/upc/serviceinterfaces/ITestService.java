package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Test;

public interface ITestService {
	public void insert(Test tst);
	public List<Test>list();
}
