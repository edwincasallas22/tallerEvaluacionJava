package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        for(int i=1; i<= 100; i++){
            if(i % 2 == 0){
                pares.add(i);
            }
            else{
                impares.add(i);
            }
         }
        System.out.println("Los numeros Pares son " + pares );
        System.out.println("Los numeros Impares son " + impares );
    }
}
