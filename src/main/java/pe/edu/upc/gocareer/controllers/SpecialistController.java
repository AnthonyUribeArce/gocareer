package pe.edu.upc.gocareer.controllers;

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

import pe.edu.upc.gocareer.entities.Specialist;
import pe.edu.upc.gocareer.serviceinterface.ISpecialistService;

@Controller
@RequestMapping("/especialistas")
public class SpecialistController {
	@Autowired
	private ISpecialistService speService;

	@GetMapping("/nuevo")
	public String newSpecialist(Model model) {
		model.addAttribute("sp", new Specialist());
		return "specialist/frmRegisterSpecialist";
	}

	@PostMapping("/guardar")
	public String saveSpecialist(@Valid Specialist spe, BindingResult binRes, Model model) {

		if (binRes.hasErrors()) {
			return "specialist/frmRegisterSpecialist";
		} else {
			speService.insert(spe);
			model.addAttribute("mensaje", "Se guardo correctamente!!");
			return "redirect:/especialistas/nuevo";
		}
	}

	@GetMapping("/listar")
	public String listSpecialist(Model model) {
		try {
			model.addAttribute("listaEspecialistas", speService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/specialist/frmListSpecialist";
	}

	@RequestMapping("/eliminar")
	public String deleteSpecialist(Map<String, Object> model, @RequestParam(value = "id") Integer id) {
		try {
			if(id!=null && id>0) {
				speService.delete(id);
				model.put("listaEspecialistas", speService.list());
			}
		} catch (Exception e) {
			model.put("error", e.getMessage());
		}
		return "/specialist/frmListSpecialist";
	}
	
	@RequestMapping("irmodificar/{id}")
	public String goUpdateSpecialist(@PathVariable int id, Model model) {
		Optional<Specialist> objSpe=speService.listId(id);
		model.addAttribute("spe",objSpe.get());
		return "specialist/frmUpdateSpecialist";
	}
	@PostMapping("/modificar")
	public String updateSpecialist(Specialist spe) {
		speService.update(spe);
		return "redirect:/especialistas/listar";
	}
}
