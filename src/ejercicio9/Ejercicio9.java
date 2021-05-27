package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        frase = frase.replaceAll("a","e");
        System.out.println("Ingrese una frase adicional: ");
        String fraseAdd = entrada.nextLine();
        System.out.println(frase + " " + fraseAdd);
    }
}
