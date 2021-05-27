package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        do {
            System.out.println("Hola, por favor ingrese un numero mayor o igual a 0: ");
            num = entrada.nextInt();
        } while (num<0);

        System.out.println("El numero ingresado es: " + num);
    }

}
