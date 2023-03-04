package org.example;

public class Perico {
    // atributos
    private String nombre;
    private int edad;
    private String especie;
    private String color;
    private boolean hablando;

    // constructor
    public Perico(String nombre, int edad, String especie, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.color = color;
    }
    // métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHablando() {
        return hablando;
    }

    public void setHablando(boolean hablando) {
        this.hablando = hablando;
    }
    // método toString
    @Override
    public String toString() {
        return "Perico{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                ", color='" + color + '\'' +
                ", hablando=" + hablando +
                '}';
    }
    // métodos de uso general
    public void hablar() {
        double random = Math.random();
        if (random < 0.5) {
            hablando = true;
            System.out.println(nombre + " está hablando");
        } else {
            System.out.println(nombre + " no quiere hablar");
        }
    }

    public void dejarDeHablar() {
        double random = Math.random();
        if (random < 0.5) {
            hablando = false;
            System.out.println(nombre + " dejó de hablar");
        } else {
            System.out.println(nombre + " sigue hablando");
        }
    }

    public void volar() {
        double random = Math.random();
        if (random < 0.5) {
            System.out.println(nombre + " está volando");
        } else {
            System.out.println(nombre + " no vuela");
        }
    }
}
