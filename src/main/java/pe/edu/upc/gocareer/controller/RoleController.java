package pe.edu.upc.gocareer.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.gocareer.entity.Role;
import pe.edu.upc.gocareer.serviceInterface.IRoleService;
import pe.edu.upc.gocareer.serviceInterface.IUserService;

@Controller
@RequestMapping("/roles")
public class RoleController {
	@Autowired
	private IRoleService rService;
	@Autowired
	private IUserService uService;

	@GetMapping("/nuevo")
	public String newUser(Model model) {
		model.addAttribute("r", new Role());
		model.addAttribute("listaUsuarios", uService.list());
		return "/role/rol";
	}

	@PostMapping("/guardar")
	public String registrarRole(@Valid Role objRole, BindingResult binRes, Model model) throws ParseException {
		if (binRes.hasErrors()) {
			return "role/rol";
		} else {
			rService.insert(objRole);
			model.addAttribute("mensaje", "Se guardo correctamente");
			return "redirect:/roles/listar";
		}
	}

	@GetMapping("/listar")
	public String listRoles(Model model) {
		try {
			model.addAttribute("listaRol", rService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "/role/frmListRol";
	}
}
