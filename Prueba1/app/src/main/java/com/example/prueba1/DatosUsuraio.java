package com.example.prueba1;

public class DatosUsuraio {


    private String id;
    private String videojuego;
    private String edad;
    private String plataforma;
    private String edadinicio;


    public DatosUsuraio() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(String videojuego) {
        this.videojuego = videojuego;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getEdadinicio() {
        return edadinicio;
    }

    public void setEdadinicio(String edadinicio) {
        this.edadinicio = edadinicio;
    }

    @Override
    public String toString() {
        return videojuego;
    }
}
