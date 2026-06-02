/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad1;

/**
 *
 * @author PC-01
 */
public class Juego {
    private String nombre;
    private boolean digital;
    private double precio;
    private String codigojuego;
    private String[] genero;

public Juego() {
        this.nombre = "";
        this.digital = false;
        this.precio = 0.0;
        this.codigojuego = "";
        this.genero = null;
    }

    public Juego(String nombre, boolean digital, double precio, String codigojuego, String[] genero) {
        this.nombre = nombre;
        this.digital = digital;
        this.precio = precio;
        this.codigojuego = codigojuego;
        this.genero = genero;
    }
}