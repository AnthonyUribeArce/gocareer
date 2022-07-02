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

import pe.edu.upc.gocareer.entities.Question;
import pe.edu.upc.gocareer.serviceinterface.IQuestionService;
import pe.edu.upc.gocareer.serviceinterface.ISpecialistService;

@Controller
@RequestMapping("/preguntas")
public class QuestionController {

	@Autowired
	private IQuestionService queService;
	@Autowired
	private ISpecialistService speService;
	
	@GetMapping("/nuevo")
	public String newQuestion(Model model) {
		model.addAttribute("question", new Question());
		model.addAttribute("listaEspecialistas", speService.list());
		return "question/frmRegister";
	}

	@PostMapping("/guardar")
	public String saveQuestion(@Valid Question question, BindingResult binRes, Model model) {

		if (binRes.hasErrors()) {
			model.addAttribute("question", new Question());
			return "question/frmRegister";
		} else {
			
			queService.insert(question);
			model.addAttribute("mensaje", "Se guardo correctamente!!");
			return "redirect:/preguntas/nuevo";
		}
	}

	@GetMapping("/listar")
	public String listQuestion(Model model) {
		try {
			model.addAttribute("listaPreguntas", queService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/question/frmList";
	}

	@RequestMapping("/eliminar")
	public String deleteQuestion(Map<String, Object> model, @RequestParam(value = "id") Integer id) {
		try {
			if(id!=null && id>0) {
				queService.delete(id);
				model.put("listaPreguntas", queService.list());
			}
		} catch (Exception e) {
			model.put("error", e.getMessage());
		}
		return "/question/frmList";
	}
	
	@RequestMapping("irmodificar/{id}")
	public String goUpdateQuestion(@PathVariable int id, Model model) {
		Optional<Question> objQue=queService.listId(id);
		model.addAttribute("qst",objQue.get());
		
		model.addAttribute("listaEspecialistas", speService.list());
		
		return "question/frmUpdate";
	}
	@PostMapping("/modificar")
	public String updateQuestion(Question qutn) {
		queService.update(qutn);
		return "redirect:/preguntas/listar";
	}
}
