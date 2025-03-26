package com.example.model;

// Modelo de usuario que recibimos en el método POST
public class Usuario {
    private String nombre;
    private String email;

    // Getters y setters (requeridos para mapear el JSON que nos envían)
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
