package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 20;
        if(num1 > num2){
            System.out.println("El numero "+ num1+ " es mayor que el numero " + num2);
        }
        else if (num2 > num1){
            System.out.println("El numero "+ num2+ " es mayor que el numero " + num1);
        }
        else{
            System.out.println("El numero "+ num1+ " es igual al numero " + num2);
        }
    }
}
