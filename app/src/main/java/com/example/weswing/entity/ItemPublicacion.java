package com.example.weswing.entity;

public class ItemPublicacion {
    private String nombreUsuario;
    private String contenido;
    private String horario;

    public ItemPublicacion(String nombreUsuario, String contenido, String horario) {
        this.nombreUsuario = nombreUsuario;
        this.contenido = contenido;
        this.horario = horario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContenido() {
        return contenido;
    }

    public String getHorario() {
        return horario;
    }
}
