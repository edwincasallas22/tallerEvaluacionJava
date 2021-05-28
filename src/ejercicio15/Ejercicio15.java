package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        Ejercicio15 opciones = new Ejercicio15();

        int num =1;
        opciones.menu();

        while (num!=8){
            num = entrada.nextInt();

            switch (num){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    opciones.menu();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("******************");
                    System.out.println("OPCION INCORRECTA");
                    System.out.println("******************");
                    opciones.menu();
            }
        }


    }
    public void menu(){
        System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
    }
}
