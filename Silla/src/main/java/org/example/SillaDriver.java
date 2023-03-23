package org.example;

public class SillaDriver {
    public static void main(String[] args) {
        Silla chair = new Silla();
        System.out.println(chair);
        chair.setAlto(1000);
        chair.setAncho(1000);
        System.out.println(chair);

    }
}