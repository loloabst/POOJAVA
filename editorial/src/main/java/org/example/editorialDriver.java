package org.example;

public class editorialDriver {
    public static void main(String[] args) {
        editorial edit = new editorial("Santillana", "México", "Av 105");
        System.out.println(edit.toString());
        edit.publicar();
        System.out.println(edit.toString());
        edit.vender();
        System.out.println(edit.toString());
    }

}
