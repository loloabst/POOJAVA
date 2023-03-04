package org.example;

public class Main {
    public static void main(String[] args) {
        //Gato
        Gato gato1 = new Gato("Benito", 3, "gris", 3.5);
        System.out.println(gato1.toString());

        gato1.dormir();
        System.out.println(gato1.toString());

        gato1.maullar();
        System.out.println(gato1.toString());

        gato1.despertar();
        System.out.println(gato1.toString());
        //Perico
        Perico perico1 = new Perico("Susano", 20, "Psittacidae", "verde");
        System.out.println(perico1.toString());

        perico1.hablar();
        System.out.println(perico1.toString());

        perico1.volar();
        System.out.println(perico1.toString());

        perico1.dejarDeHablar();
        System.out.println(perico1.toString());
    }
}
