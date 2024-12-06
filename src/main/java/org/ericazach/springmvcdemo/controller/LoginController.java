package org.ericazach.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class LoginController {
    
    @PostMapping("/iniciarSesion")
    public String login( @RequestParam String usuario, @RequestParam String password, Model model ) {
        //logica validacion de usuario y password
        if(!usuario.isBlank() || !password.isBlank()) {
            model.addAttribute("usuario", usuario);
            // model.addAttribute("password", password);
        } else {
            model.addAttribute("mensajeError", "Debes ingresar un usuario y contraseña");
            return "error";
        }

        return "dashboard";
    }
}
