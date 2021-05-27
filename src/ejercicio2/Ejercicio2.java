package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Hola, por favor ingrese el valor del primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Ahora ingrese el valor del segundo numero:");
        num2 = entrada.nextInt();
        if(num1 > num2){
            System.out.println("El primer numero "+ num1+ " es mayor que el segundo numero " + num2);
        }
        else if (num2 > num1){
            System.out.println("El segundo numero "+ num2+ " es mayor que el primer numero " + num1);
        }
        else{
            System.out.println("El primer numero "+ num1+ " es igual al segundo numero " + num2);
        }
    }
}
