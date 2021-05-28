package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola, por favor ingrese la primera palabra: ");
        String palabra1= entrada.nextLine();
        System.out.println("Ahora ingrese la segunda palabra: ");
        String palabra2 = entrada.nextLine();

    if(palabra1.equals(palabra2)){
        System.out.println("Las dos palabras son iguales :)");
    }
    else{
        if(palabra1.length() == palabra2.length()){
            System.out.println("Las diferencias encontradas entre la primera palabra: " + palabra1 + " y la segunda palabra: " + palabra2 + " son: ");
            for (int i = 0; i < palabra1.length() ; i++) {
                System.out.println(palabra1.charAt(i) + "-----" + palabra2.charAt(i));
                if(palabra1.charAt(i) != palabra2.charAt(i) ){
                    System.out.println("Las letras diferentes son: " + palabra1.charAt(i) + " --- " + palabra2.charAt(i));
                }

            }
        }
        else {
            System.out.println("Las dos palabras no son iguales en longitd ");
        }


    }









    }
}
