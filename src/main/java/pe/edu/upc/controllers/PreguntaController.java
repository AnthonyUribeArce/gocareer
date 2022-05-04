package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Especialista;
import pe.edu.upc.entities.Pregunta;
import pe.edu.upc.serviceinterfaces.IEspecialistaService;
import pe.edu.upc.serviceinterfaces.IPreguntaService;

@Named
@RequestScoped
public class PreguntaController {
	@Inject
	private IPreguntaService preService;
	@Inject
	private IEspecialistaService eService;

	private Pregunta pre;
	List<Pregunta> listaPregunta;
	List<Especialista> listaEspecialista;

	@PostConstruct
	public void init() {
		this.pre = new Pregunta();
		this.listaPregunta = new ArrayList<Pregunta>();
		this.list();
		this.listEspecialista();
	}
	
	public void insert() {
		try {
			preService.insert(pre);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controlador de pregunta");
		}
	}
	
	public void list() {
		try {
			listaPregunta=preService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controlador de pregunta");
		}
	}
	
	public void delete(Pregunta pre) {
		try {
			preService.delete(pre.getCPregunta());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de pregunta");
		}
	}
	
	public void listEspecialista() {
		try {
			listaEspecialista=eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar especialista en el controlador de pregunta");
		}
	}

	public Pregunta getPre() {
		return pre;
	}

	public void setPre(Pregunta pre) {
		this.pre = pre;
	}

	public List<Pregunta> getListaPregunta() {
		return listaPregunta;
	}

	public void setListaPregunta(List<Pregunta> listaPregunta) {
		this.listaPregunta = listaPregunta;
	}

	public List<Especialista> getListaEspecialista() {
		return listaEspecialista;
	}

	public void setListaEspecialista(List<Especialista> listaEspecialista) {
		this.listaEspecialista = listaEspecialista;
	}
	
}
