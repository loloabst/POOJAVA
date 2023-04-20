package org.example.herenciamultiple;

public class Alumno extends Persona{
    private int numerCuenta;
    private String promedio;

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    public Alumno(String nombre, int edad, int numerCuenta, String promedio) {
        super(nombre, edad);
        this.numerCuenta = numerCuenta;
        this.promedio = promedio;
    }

    public int getNumerCuenta() {
        return numerCuenta;
    }

    public void setNumerCuenta(int numerCuenta) {
        this.numerCuenta = numerCuenta;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numerCuenta=" + numerCuenta +
                ", promedio='" + promedio + '\'' +
                '}';
    }
}
