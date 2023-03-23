package org.example;

public class autorDriver {
    public static void main(String[] args) {
        autor autor1 = new autor("Juan", "patricio", "México");
        autor1.escribir();
        System.out.println(autor1.toString());
        autor1.promociones();
        System.out.println(autor1.toString());
    }
}
