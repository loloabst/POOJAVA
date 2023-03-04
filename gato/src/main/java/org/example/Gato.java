package org.example;

public class Gato {
    // atributos
    private String nombre;
    private int edad;
    private String color;
    private double peso;
    private boolean estaDurmiendo;

    // constructor
    public Gato(String nombre, int edad, String color, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEstaDurmiendo() {
        return estaDurmiendo;
    }

    public void setEstaDurmiendo(boolean estaDurmiendo) {
        this.estaDurmiendo = estaDurmiendo;
    }
// método toString
    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", estaDurmiendo=" + estaDurmiendo +
                '}';
    }
    // métodos de uso general
    public void dormir() {
        double random = Math.random();
        if (random < 0.5) {
            estaDurmiendo = true;
            System.out.println(nombre + " está durmiendo.");
        } else {
            System.out.println(nombre + " no quiere dormir.");
        }
    }

    public void despertar() {
        double random = Math.random();
        if (random < 0.5) {
            estaDurmiendo = false;
            System.out.println(nombre + " se ha despertado.");
        } else {
            System.out.println(nombre + " está dormido.");
        }
    }

    public void maullar() {
        double random = Math.random();
        if (random < 0.5) {
            System.out.println(nombre + " está maullando.");
        } else {
            System.out.println(nombre + " no está maullando.");
        }
    }
}
