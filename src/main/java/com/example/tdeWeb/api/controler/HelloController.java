package com.example.tdeWeb.api.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotação que define a classe como um controlador REST
@RequestMapping("/api") // Define o caminho base da API
public class HelloController {

    @GetMapping("/hello") // Mapeia a URL /api/hello
    public String sayHello() {
        return "Olá, Bem-vindo à API!";
    }
}
