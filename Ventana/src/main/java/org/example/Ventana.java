package org.example;

public class Ventana {
    private double alto;
    private double ancho;
    private double porcentajeApertura;

    public Ventana() {
    }

    public Ventana(double alto, double ancho, double porcentajeApertura) {
        this.alto = alto;
        this.ancho = ancho;
        this.porcentajeApertura = porcentajeApertura;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto>= 50 && alto<= 300) {
            this.alto = alto;
        }else {
            System.out.println("el numero es invalido");
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho>=50 && ancho <= 250) {
            this.ancho = ancho;
        }else {
            System.out.println("el numero es invalido");
        }
    }

    public double getPorcentajeApertura() {
        return porcentajeApertura;
    }

    public void setPorcentajeApertura(double porcentajeApertura) {
        if (porcentajeApertura>=0 && porcentajeApertura<=100) {
            this.porcentajeApertura = porcentajeApertura;
        }else {
            System.out.println("el porcentaje es erroneo");
        }
    }

    @Override
    public String toString() {
        return "Ventana{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", porcentajeApertura=" + porcentajeApertura +
                '}';
    }
    public void abrir(double porcentaje){
        if (porcentaje == 100){
            System.out.println("la ventana esta completamente abierta");
        }else {
            System.out.println("la ventana se ha abierto al " + porcentaje);
        }
    }
    public boolean cerrar(double porcentaje){
        System.out.println("la ventana se ha cerrado");
        return false;

    }
}
