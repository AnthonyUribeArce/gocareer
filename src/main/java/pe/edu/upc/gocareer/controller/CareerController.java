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

import pe.edu.upc.gocareer.entity.Career;
import pe.edu.upc.gocareer.serviceInterface.ICareerService;


@Controller
@RequestMapping("/carreras")
public class CareerController {
	@Autowired
	private ICareerService careerService;

	@GetMapping("/nuevo")
	public String newCareer(Model model) {
		model.addAttribute("carrera", new Career());
		return "career/frmRegisterCareer";
	}

	@PostMapping("/guardar")
	public String saveCareer(@Valid Career carrera, BindingResult binRes, Model model) {

		if (binRes.hasErrors()) {
			model.addAttribute("carrera", new Career());
			return "career/frmRegisterCareer";
		} else {
			model.addAttribute("carrera", new Career());
			careerService.insert(carrera);
			model.addAttribute("mensaje", "Se guardo correctamente!!");
			return "redirect:/carreras/nuevo";
		}
	}

	@GetMapping("/listar")
	public String listCareer(Model model) {
		try {
			model.addAttribute("listaCarreras", careerService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/career/frmListCareer";
	}

	@RequestMapping("/eliminar")
	public String deleteCareer(Map<String, Object> model, @RequestParam(value = "id") Integer id) {
		try {
			if(id!=null && id>0) {
				careerService.delete(id);
				model.put("listaCarreras", careerService.list());
			}
		} catch (Exception e) {
			model.put("error", e.getMessage());
		}
		return "/career/frmListCareer";
	}
	
	@RequestMapping("irmodificar/{id}")
	public String goUpdateCareer(@PathVariable int id, Model model) {
		Optional<Career> objCar=careerService.listId(id);
		model.addAttribute("car",objCar.get());
		return "career/frmUpdateCareer";
	}
	@PostMapping("/modificar")
	public String updateCareer(Career car) {
		careerService.update(car);
		return "redirect:/carreras/listar";
	}
}
