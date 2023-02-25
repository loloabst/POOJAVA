import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //pedimos una cadena
        System.out.print("Ingrese una cadena de solo 9 caracteres, solo se recibe X, O o _ : ");
        String cadena = scanner.nextLine();
        //verificamos que la cadena ungresada no sea mayor a 9 caracteres y que la cadena solo tenga los caracteres X_ o O
        if (cadena.length() != 9 || !cadena.matches("[XO_]")){
            System.out.println("La cadena ingresada es invalida");
            return;
        }
        //creacion del tablero y datos
        System.out.println("-----");
        System.out.println("|" + cadena.charAt(0) +  cadena.charAt(1)  + cadena.charAt(2) + "|");
        System.out.println("|" + cadena.charAt(3)  + cadena.charAt(4)  + cadena.charAt(5) + "|");
        System.out.println("|" + cadena.charAt(6)  + cadena.charAt(7)  + cadena.charAt(8) + "|");
        System.out.println("-----");
    }
}
