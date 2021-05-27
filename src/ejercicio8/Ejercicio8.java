package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola, por favor ingrese un dia de la semana para saber si es laboral o no: ");
        String dia = entrada.nextLine();
        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("El dia " + dia + " es laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El dia " + dia + " no es laboral");
                break;
            default:
                System.out.println("El dia ingresado es incorrecto, verifica que este bien escrito y en minuscula");
        }
    }
}
