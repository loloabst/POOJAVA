package org.example;

public class MaquinaDriver {
    public static void main(String[] args) {
        MaquinadeCafe machine = new MaquinadeCafe();
        for (int i = 1; i <= 27; i++) {
            machine.americano();
        }
        machine.americano();


    }
}


