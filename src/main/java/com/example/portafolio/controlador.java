package com.example.portafolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;



@Controller
@Slf4j

public class controlador {


    @GetMapping("/")
    public String inicio() {
        return "index";
    }
    @GetMapping("/sobremi")
    public String sobremi() {
        return "aboutme";
    }
    @GetMapping("/proyectos")
    public String proyectos() {
        return "projects";
    }
    @GetMapping("/contacto")
    public String contactame() {
        return "contact";
    }
}
