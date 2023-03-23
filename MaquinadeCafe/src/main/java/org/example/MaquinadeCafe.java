package org.example;

public class MaquinadeCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;


    public MaquinadeCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = 5000;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = 1000;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = 1500;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = 50;
    }

    @Override
    public String toString() {
        return "MaquinadeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    public void americano() {
        if (this.agua >= 180 && this.cafe >= 15 && this.vasos > 0) {
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos-=1;
            System.out.println("Se sirvió un café americano.");
        } else {
            System.out.println("No se puede servir más café.");
            cantidad();
        }
    }
    public void expreso() {
        if (this.agua >= 120 && this.cafe >= 20 && this.vasos > 0) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos-=1;
            System.out.println("Se sirvió un café expreso.");
        } else {
            System.out.println("No se puede servir más café.");
            cantidad();
        }
    }
    public void capuchino() {
        if (this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos > 0) {
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos-=1;
            System.out.println("Se sirvió un capuchino.");
        } else {
            System.out.println("No se puede servir más café.");
            cantidad();
        }
    }
    public void cantidad() {
        System.out.println("Cantidad de agua: " + this.agua + " ml");
        System.out.println("Cantidad de café: " + this.cafe + " g");
        System.out.println("Cantidad de crema: " + this.crema + " ml");
    }
}
