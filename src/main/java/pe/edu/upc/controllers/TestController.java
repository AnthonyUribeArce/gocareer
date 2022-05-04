package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Alumno;
import pe.edu.upc.entities.Test;
import pe.edu.upc.serviceinterfaces.IAlumnoService;
import pe.edu.upc.serviceinterfaces.ITestService;

@Named
@RequestScoped
public class TestController {
	@Inject
	private ITestService tstService;
	@Inject
	private IAlumnoService aService;
	
	private Test tst;
	List<Test> listaTest;
	List<Alumno> listaAlumno;
	
	@PostConstruct
	public void init() {
		this.tst=new Test();
		this.listaTest=new ArrayList<Test>();
	}

	public void insert() {
		try {
			tstService.insert(tst);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controlador de test");
		}
	}
	
	public void list() {
		try {
			listaTest=tstService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controlador de test");
		}
	}
	
	public void listAlumnos() {
		try {
			listaAlumno=aService.list();
		} catch (Exception e) {
			System.out.println("Error al listar alumnos en el controlador de test");
		}
	}
	
	public Test getTst() {
		return tst;
	}

	public void setTst(Test tst) {
		this.tst = tst;
	}

	public List<Test> getListaTest() {
		return listaTest;
	}

	public void setListaTest(List<Test> listaTest) {
		this.listaTest = listaTest;
	}

	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}
	
}
