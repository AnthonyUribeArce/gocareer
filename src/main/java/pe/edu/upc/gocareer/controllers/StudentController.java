package pe.edu.upc.gocareer.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.gocareer.entities.Student;
import pe.edu.upc.gocareer.serviceinterface.IStudentService;

@Controller
@RequestMapping("/estudiantes")
public class StudentController {

	private IStudentService studService;

	@GetMapping("/nuevo")
	public String newStudent(Model model) {
		model.addAttribute("s", new Student());
		return "student/frmRegister";
	}

	@PostMapping("/guardar")
	public String saveStudent(@Valid Student st, BindingResult binRes, Model model) {

		if (binRes.hasErrors()) {
			return "student/frmRegister";
		} else {
			studService.insert(st);
			model.addAttribute("mensaje", "Se guardo correctamente!!");
			return "redirect:/estudiantes/nuevo";
		}
	}

	@GetMapping("/listar")
	public String listStudent(Model model) {
		try {
			model.addAttribute("listaEstudiantes", studService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		
		return "/student/";
	}

}
