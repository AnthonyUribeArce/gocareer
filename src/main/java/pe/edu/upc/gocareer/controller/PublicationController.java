package pe.edu.upc.gocareer.controller;

import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pe.edu.upc.gocareer.entity.Publication;
import pe.edu.upc.gocareer.serviceInterface.IPublicationService;
import pe.edu.upc.gocareer.serviceInterface.ISpecialistService;


@Controller
@RequestMapping("/publicaciones")
public class PublicationController {

	@Autowired
	private IPublicationService pubService;
	@Autowired
	private ISpecialistService speService;
	
	@GetMapping("/nuevo")
	public String newPublication(Model model) {
		model.addAttribute("p", new Publication());
		
		model.addAttribute("listaEspecialistas", speService.list());
		
		return "publication/frmPublication";
	}

	@PostMapping("/guardar")
	public String savePublication(@Valid Publication pb, BindingResult binRes, Model model) {

		if (binRes.hasErrors()) {
			model.addAttribute("p", new Publication());
			model.addAttribute("listaEspecialistas", speService.list());
			return "publication/frmRegister";
		} else {
			model.addAttribute("p", new Publication());
			model.addAttribute("listaEspecialistas", speService.list());
			pubService.insert(pb);
			model.addAttribute("mensaje", "Se guardo correctamente!!");
			return "redirect:/publicaciones/nuevo";
		}
	}

	@GetMapping("/listar")
	public String listPublication(Model model) {
		try {
			model.addAttribute("listaPublicaciones", pubService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/publication/listPublication";
	}

	@RequestMapping("/eliminar")
	public String deletePublication(Map<String, Object> model, @RequestParam(value = "id") Integer id) {
		try {
			if(id!=null && id>0) {
				pubService.delete(id);
				model.put("listaPublicaciones", pubService.list());
			}
		} catch (Exception e) {
			model.put("error", e.getMessage());
		}
		return "/publication/listPublication";
	}
	
	@RequestMapping("irmodificar/{id}")
	public String goUpdatePublication(@PathVariable int id, Model model) {
		Optional<Publication> objPub=pubService.listId(id);
		model.addAttribute("pbtn",objPub.get());
		
		model.addAttribute("listaEspecialistas", speService.list());
		
		return "publication/update";
	}
	@PostMapping("/modificar")
	public String updatePublication(Publication pst) {
		pubService.update(pst);
		return "redirect:/publicaciones/listar";
	}
}
