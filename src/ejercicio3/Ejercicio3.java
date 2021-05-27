package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Area area = new Area();

        System.out.println("Hola, por favor ingrese el valor del radio: ");
        String radIn = entrada.next();
        area.setRadio(Double.parseDouble(radIn));
        System.out.println("El área del círculo es: " + area.obtenerArea());
    }
}








