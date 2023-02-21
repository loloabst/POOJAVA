import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tus datos con el siguiente formato: Nombre Profesion Pais: ");
        String teclado = sc.nextLine();
        String[] datos = teclado.split(" ");
        String nombre = datos[0];
        String profesion = datos[1];
        String pais = datos[2];
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesion: " + profesion);
        System.out.println("Pais: " + pais);
    }
}
