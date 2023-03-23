package org.example;

import java.awt.*;

public class perroDriver {
    public static void main(String[] args) {
        perro dog = new perro("Labrador","grande", Color.white);
        dog.dormir();
        System.out.println(dog.toString());
        dog.ladrar();

    }
}
