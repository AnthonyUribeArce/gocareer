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

import pe.edu.upc.gocareer.entities.Student;
import pe.edu.upc.gocareer.serviceinterface.IStudentService;

@Controller
@RequestMapping("/estudiantes")
public class StudentController {
	@Autowired
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

		return "/student/frmList";
	}

	@RequestMapping("/eliminar")
	public String deleteStudent(Map<String, Object> model, @RequestParam(value = "id") Integer id) {
		try {
			if(id!=null && id>0) {
				studService.delete(id);
				model.put("listaEstudiantes", studService.list());
			}
		} catch (Exception e) {
			model.put("error", e.getMessage());
		}
		return "/student/frmList";
	}
	
	@RequestMapping("irmodificar/{id}")
	public String goUpdateStudent(@PathVariable int id, Model model) {
		Optional<Student> objStu=studService.listId(id);
		model.addAttribute("stn",objStu.get());
		return "student/frmUpdate";
	}
	@PostMapping("/modificar")
	public String updateStudent(Student stu) {
		studService.update(stu);
		return "redirect:/estudiantes/listar";
	}
}
