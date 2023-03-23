package org.example;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class autor {
    private String nombre;
    private String pseudonimo;
    private String pais;

    public autor() {
    }

    public autor(String nombre, String pseudonimo, String pais) {
        this.nombre = nombre;
        this.pseudonimo = pseudonimo;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "autor{" +
                "nombre='" + nombre + '\'' +
                ", pseudonimo='" + pseudonimo + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
    public void escribir(){
        System.out.println(nombre + " está escribiendo");
    }
    public void promociones(){
        System.out.println("hay nuevas promociones");
    }
}
