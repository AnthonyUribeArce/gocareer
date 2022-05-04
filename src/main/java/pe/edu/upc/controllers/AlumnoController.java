package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Alumno;
import pe.edu.upc.serviceinterfaces.IAlumnoService;

@Named
@RequestScoped
public class AlumnoController {

	@Inject
	private IAlumnoService aService;

	private Alumno a;
	List<Alumno> listaAlumno;

	@PostConstruct
	public void init() {
		this.listaAlumno = new ArrayList<Alumno>();
		this.a = new Alumno();
		this.list();
	}

	public String newAlumno() {
		this.setA(new Alumno());
		return "alumno.xhtml";
	}

	public void insert() {
		try {
			aService.insert(a);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de Alumno");
		}
	}

	public void list() {
		try {
			listaAlumno = aService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de Alumno");
		}
	}

	public void delete(Alumno al) {
		try {
			aService.delete(al.getCEstudiante());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de Alumno");
		}
	}
	
	public Alumno getA() {
		return a;
	}

	public void setA(Alumno a) {
		this.a = a;
	}

	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

}
