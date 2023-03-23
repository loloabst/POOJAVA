package org.example;

public class libro {
    private String titulo;
    private String precio;
    private String sinopsis;

    public libro() {
    }

    public libro(String titulo, String precio, String sinopsis) {
        this.titulo = titulo;
        this.precio = precio;
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "libro{" +
                "titulo='" + titulo + '\'' +
                ", precio='" + precio + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                '}';
    }
    public void guardar(){
        System.out.println("el libro ha sido guardado");
    }
}
