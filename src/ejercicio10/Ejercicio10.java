package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola, por favor ingrese una frase: ");
        String frase = entrada.nextLine();
        frase = frase.replaceAll(" ", "");
        System.out.println(frase);

    }
}
