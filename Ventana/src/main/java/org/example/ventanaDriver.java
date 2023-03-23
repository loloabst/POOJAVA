package org.example;

public class ventanaDriver {
    public static void main(String[] args) {
        Ventana window = new Ventana();
        System.out.println(window);
        window.setAlto(200);
        window.setAncho(200);
        window.setPorcentajeApertura(100);
        window.abrir(100);
        System.out.println(window);
    }
}
