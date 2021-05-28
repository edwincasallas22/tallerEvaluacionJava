package ejercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola, por favor ingrese un numero: ");
        int num = entrada.nextInt();
        List<Integer> numeros = new ArrayList<>();

        if(num < 1000){
            for (int i = num; i<1000; i+=2){
                numeros.add(i);
           }
            System.out.println("Los numeros entre " + num + " y 1000 con saltos de 2 en 2 son: " + numeros);
        }
        else{
            System.out.println("El numero a ingresar debe ser menor que 1000, intenta de nuevo");
        }


    }
}
