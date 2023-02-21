import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena de caracteres: ");
        String input = sc.nextLine();
        boolean siguientes = true; //se inicializa variable booleana
        for (int i=1;i<input.length();i++){ // se recorre la cadena de caracteres
            if((int)input.charAt(i)!=(int)input.charAt(i-1)+1){ // se compara el valor ASCII DEL CARACTER ACTUAL CON EL ANTERIOR
                siguientes = false;
            }
        }
        System.out.println(siguientes);
    }
}