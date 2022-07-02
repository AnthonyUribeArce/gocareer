package pe.edu.upc.gocareer.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.gocareer.entity.Users;
import pe.edu.upc.gocareer.serviceInterface.IUserService;

@Controller
@RequestMapping("/usuarios")
public class UserController {
	@Autowired
	private IUserService uService;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/nuevo")
	public String newUser(Model model) {
		model.addAttribute("u", new Users());
		return "user/usuario";
	}

	@PostMapping("/guardar")
	public String registrarUser(@Valid Users objUser, BindingResult binRes, Model model) throws ParseException {
		if (binRes.hasErrors()) {
			return "user/frmUser";
		} else {
			String p = objUser.getPassword();
			String pE = passwordEncoder.encode(p);
			Users us = new Users();
			us.setUsername(objUser.getUsername());
			us.setEnabled(objUser.getEnabled());
			us.setPassword(pE);

			uService.insert(us);
			model.addAttribute("mensaje", "Se guardo correctamente");
			return "redirect:/usuarios/listar";
		}
	}

	@GetMapping("/listar")
	public String listUsers(Model model) {

		try {
			model.addAttribute("frmList", uService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "/user/frmList";
	}

}
