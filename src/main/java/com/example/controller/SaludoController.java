package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controlador para manejar los mensajes de saludo
@RestController
public class SaludoController {

    // Inyectamos el valor desde application.properties
    @Value("${app.mensaje.bienvenida}")
    private String mensaje;

    // Endpoint para probar el método GET
    @GetMapping("/saludo")
    public String saludo() {
        return "Hola, este es un método GET";
    }

    // Endpoint para obtener el mensaje de bienvenida configurado
    @GetMapping("/bienvenida")
    public String obtenerMensaje() {
        return mensaje;
    }
}
