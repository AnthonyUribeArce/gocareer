package pe.edu.upc.gocareer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class NeutralController {

    @GetMapping("/landing")
    public String goLanding() {
        return "neutral/landing";
    }

    @GetMapping("/home")
    public String goHome() {
        return "neutral/home";
    }

    @GetMapping("/login")
    public String goLogin() {
        return "neutral/login";
    }

    @GetMapping("/type")
    public String goType() {
        return "neutral/type";
    }
}