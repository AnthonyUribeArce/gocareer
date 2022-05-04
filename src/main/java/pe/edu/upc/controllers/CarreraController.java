package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Carrera;
import pe.edu.upc.serviceinterfaces.ICarreraService;

@Named
@RequestScoped
public class CarreraController {
	
	@Inject
	private ICarreraService cService;
	
	private Carrera c;
	List<Carrera> listaCarrera;
	@PostConstruct
	public void init() {
		this.listaCarrera=new ArrayList<Carrera>();
		this.c=new Carrera();
		this.list();
	}
	
	public String newCarrera() {
		this.setC(new Carrera());
		return "carrera.xhtml";
	}
	
	public void insert() {
		try {
			cService.insert(c);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de Carrera");
		}
	}
	
	public void list() {
		try {
			listaCarrera=cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de Carrera");
		}
	}
	public String preUpdate(Carrera c) {
		this.setC(c);
		return "modificarCarrera.xhtml";
	}
	public void Update() {
		try {
			cService.update(this.c);
		} catch (Exception e) {
			System.out.println("Error al modificar en el controller de carrera");
		}
	}
	public void delete(Carrera c) {
		try {
			cService.delete(c.getCCarrera());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de carrera");
		}
	}
	public Carrera getC() {
		return c;
	}
	public void setC(Carrera c) {
		this.c = c;
	}
	public List<Carrera> getListaCarrera() {
		return listaCarrera;
	}
	public void setListaCarrera(List<Carrera> listaCarrera) {
		this.listaCarrera = listaCarrera;
	}
	
	
}
