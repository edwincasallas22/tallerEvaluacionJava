package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
         int max = 100;
         int contador = 1;
        while (contador <= 100){
                if(contador % 2 == 0){
                    pares.add(contador);
                }
                else {
                    impares.add(contador);

                }
                contador++;

        }
        System.out.println("Los numeros Pares son " + pares );
        System.out.println("Los numeros Impares son " + impares );
    }
}
