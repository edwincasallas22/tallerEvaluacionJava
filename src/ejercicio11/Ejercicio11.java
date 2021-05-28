package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola, por favor ingrese una frase: ");
        String frase = entrada.nextLine();
        Vocales vocal = new Vocales(frase);
        vocal.obtenerVocales();

        System.out.println("La longitud total de la frase es: "+ frase.length() +
                "\n La frase tiene " + vocal.contA + " a" +
                "\n La frase tiene " + vocal.contE + " e" +
                "\n La frase tiene " + vocal.contI + " i" +
                "\n La frase tiene " + vocal.contO + " o" +
                "\n La frase tiene " + vocal.contU + " u" );
    }
}
