package org.example;

public class libroDriver {
    public static void main(String[] args) {
        libro book = new libro("principito", "200 pesos", " un personaje muy bueno");
        System.out.println(book.toString());
        book.guardar();
    }
}
