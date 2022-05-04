package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Especialista;
import pe.edu.upc.entities.Publicacion;
import pe.edu.upc.serviceinterfaces.IEspecialistaService;
import pe.edu.upc.serviceinterfaces.IPublicacionService;

@Named
@RequestScoped
public class PublicacionController {
	@Inject
	private IPublicacionService pubService;
	@Inject
	private IEspecialistaService eService;
	
	private Publicacion pub;
	List<Publicacion> listaPublicacion;
	List<Especialista> listaEspecialista;
	
	@PostConstruct
	public void init() {
		this.pub=new Publicacion();
		this.listaPublicacion=new ArrayList<Publicacion>();
		this.list();
		this.listEspecialista();
	}

	public void insert() {
		try {
			pubService.insert(pub);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controlador de publicacion");
		}
	}
	
	public void list() {
		try {
			listaPublicacion=pubService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controlador de publicacion");
		}
	}
	
	public void listEspecialista() {
		try {
			listaEspecialista=eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar especialista en el controlador de pregunta");
		}
	}
	
	public Publicacion getPub() {
		return pub;
	}

	public void setPub(Publicacion pub) {
		this.pub = pub;
	}

	public List<Publicacion> getListaPublicacion() {
		return listaPublicacion;
	}

	public void setListaPublicacion(List<Publicacion> listaPublicacion) {
		this.listaPublicacion = listaPublicacion;
	}

	public List<Especialista> getListaEspecialista() {
		return listaEspecialista;
	}

	public void setListaEspecialista(List<Especialista> listaEspecialista) {
		this.listaEspecialista = listaEspecialista;
	}
	
}
