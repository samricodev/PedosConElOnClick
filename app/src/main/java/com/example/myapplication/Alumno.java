package com.example.myapplication;

public class Alumno {
    private int registro;
    private String nombre;
    private String apellidos;
    private String direccion;

    public Alumno() {
        this.registro = 0;
        this.nombre = "";
        this.apellidos = "";
        this.direccion = "";
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
