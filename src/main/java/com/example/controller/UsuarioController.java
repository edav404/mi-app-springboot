package com.example.controller;

import com.example.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Controlador para manejar los usuarios
@RestController
public class UsuarioController {

    // Endpoint para recibir datos de un usuario (método POST)
    @PostMapping("/usuario")
    public String crearUsuario(@RequestBody Usuario usuario) {
        // Accedemos al nombre enviado en el JSON y lo retornamos como respuesta
        return "Usuario recibido: " + usuario.getNombre() + ", Email: " + usuario.getEmail();
    }
}
