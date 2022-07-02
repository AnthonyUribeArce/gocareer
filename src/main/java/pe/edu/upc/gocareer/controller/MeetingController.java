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

import pe.edu.upc.gocareer.entity.Meeting;
import pe.edu.upc.gocareer.serviceInterface.IMeetingService;
import pe.edu.upc.gocareer.serviceInterface.ISpecialistService;
import pe.edu.upc.gocareer.serviceInterface.IStudentService;


@Controller
@RequestMapping("/TB4")
public class MeetingController {
	
	@Autowired
	private IMeetingService meetService;
	@Autowired
	private IStudentService stuService;
	@Autowired
	private ISpecialistService speService;
	
	@GetMapping("/new")
	public String newMeeting(Model model) {
		model.addAttribute("m", new Meeting());
		
		model.addAttribute("listaEstudiantes", stuService.list());
		model.addAttribute("listaEspecialistas", speService.list());
		
		return "meeting/frmMeeting";
	}

	@PostMapping("/guardar")
	public String saveMeeting(@Valid Meeting me, BindingResult binRes, Model model) {

		if (binRes.hasErrors()) {
			model.addAttribute("m", new Meeting());
			return "meeting/frmRegister";
		} else {
			model.addAttribute("m", new Meeting());
			meetService.insert(me);
			model.addAttribute("mensaje", "Se guardo correctamente!!");
			return "redirect:/reuniones/nuevo";
		}
	}

	@GetMapping("/listar")
	public String listMeeting(Model model) {
		try {
			model.addAttribute("listareuniones", meetService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/meeting/listMeeting";
	}

	@RequestMapping("/eliminar")
	public String deleteMeeting(Map<String, Object> model, @RequestParam(value = "id") Integer id) {
		try {
			if(id!=null && id>0) {
				meetService.delete(id);
				model.put("listareuniones", meetService.list());
			}
		} catch (Exception e) {
			model.put("error", e.getMessage());
		}
		return "/meeting/listMeeting";
	}
	
	@RequestMapping("irmodificar/{id}")
	public String goUpdateMeeting(@PathVariable int id, Model model) {
		Optional<Meeting> objMeet=meetService.listId(id);
		model.addAttribute("metg",objMeet.get());
		
		model.addAttribute("listaEstudiantes", stuService.list());
		model.addAttribute("listaEspecialistas", speService.list());
		
		return "meeting/update";
	}
	@PostMapping("/modificar")
	public String updateMeeting(Meeting meet) {
		meetService.update(meet);
		
		return "redirect:/reuniones/listar";
	}
}
