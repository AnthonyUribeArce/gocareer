package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Alumno;
import pe.edu.upc.entities.Especialista;
import pe.edu.upc.entities.Reunion;
import pe.edu.upc.serviceinterfaces.IAlumnoService;
import pe.edu.upc.serviceinterfaces.IEspecialistaService;
import pe.edu.upc.serviceinterfaces.IReunionService;

@Named
@RequestScoped
public class ReunionController {

	@Inject
	private IReunionService rService;
	@Inject
	private IAlumnoService aService;
	@Inject
	private IEspecialistaService eService;

	private Reunion r;
	List<Reunion> listaReunion;
	List<Alumno> listaAlumno;
	List<Especialista> listaEspecialista;

	@PostConstruct
	public void init() {
		this.listaReunion = new ArrayList<Reunion>();
		this.r = new Reunion();
		this.listaAlumno = new ArrayList<Alumno>();
		this.listaEspecialista = new ArrayList<Especialista>();
		this.listAlumnos();
		this.listEspecialistas();
		this.list();
	}

	public String newReunion() {
		this.setR(new Reunion());
		return "reunion.xhtml";
	}

	public void insert() {
		try {
			rService.insert(r);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de Reunion");
		}
	}

	public void list() {
		try {
			listaReunion = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de Reunion");
		}
	}

	public void delete(Reunion r) {
		try {
			rService.delete(r.getIdReunion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de Reunion");
		}
	}
	public String preUpdate(Reunion r) {
		this.setR(r);
		return "modificarReunion.xhtml";
	}
	public void Update() {
		try {
			rService.update(this.r);
		} catch (Exception e) {
			System.out.println("Error al modificar en el controller de reunion");
		}
	}

	public void listAlumnos() {
		try {
			listaAlumno = aService.list();
		} catch (Exception e) {
			System.out.println("Error al listar alumnos en el controller de Reunion");
		}
	}

	public void listEspecialistas() {
		try {
			listaEspecialista = eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar especialistas en el controller de Reunion");
		}
	}

	public Reunion getR() {
		return r;
	}

	public void setR(Reunion r) {
		this.r = r;
	}

	public List<Reunion> getListaReunion() {
		return listaReunion;
	}

	public void setListaReunion(List<Reunion> listaReunion) {
		this.listaReunion = listaReunion;
	}

	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	public List<Especialista> getListaEspecialista() {
		return listaEspecialista;
	}

	public void setListaEspecialista(List<Especialista> listaEspecialista) {
		this.listaEspecialista = listaEspecialista;
	}

}