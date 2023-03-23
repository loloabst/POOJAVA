package org.example;

import java.awt.*;
import java.util.Random;

public class perro {
    private String raza;
    private String tamanio;
    private Color color;

    public perro() {
    }

    public perro(String raza, String tamanio, Color color) {
        this.raza = raza;
        this.tamanio = tamanio;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "perro{" +
                "raza='" + raza + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", color=" + color +
                '}';
    }

    public void ladrar(){
        System.out.println("el perro ladró");
    }
    public int dormir(){
        Random rand = new Random();
        int tiempo = rand.nextInt(60);
        System.out.println("el pero ha dormido durante " + tiempo + " segundos" );
        return tiempo;
    }

}
