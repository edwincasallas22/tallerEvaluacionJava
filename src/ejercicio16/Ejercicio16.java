package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        double peso;
        double altura;
        String sexo;


        System.out.println("Ingresa el nombre de la persona");
        nombre = entrada.nextLine();
        System.out.println("Ingresa la edad de la persona");
        edad = entrada.nextInt();
        System.out.println("Ingresa el sexo de la persona: H para hombre, M para mujer");
        sexo = entrada.next().toUpperCase();
        System.out.println("Ingresa el peso de la persona ejemplo: 55 (sin puntos ni comas)");
        peso = entrada.nextDouble();
        System.out.println("Ingresa la altura de la persona ejemplo: 175 (sin puntos ni comas)");
        altura = entrada.nextDouble();
        Persona persona1 = new Persona(nombre, edad ,sexo.charAt(0), peso , altura);
        persona1.generarDNI();
        Persona persona2 = new Persona("Edwin Casallas", 23 ,'H');
        persona2.generarDNI();
        Persona persona3 = new Persona();
        persona3.generarDNI();
        persona3.setAltura(1.90);
        persona3.setPeso(75.9);
        persona3.setNombre("Mario Casallas");
        persona3.setEdad(52);
        persona3.comprobarSexo('M');


        System.out.println("Resultados de "+ persona1.getNombre()+" "+persona1.obtenerPeso());
        System.out.println("Informacion general "+persona1);
        System.out.println("Resultados de "+ persona2.getNombre()+" "+persona2.obtenerPeso());
        System.out.println("Informacion general "+persona2);
        System.out.println("Resultados de "+ persona3.getNombre()+" "+persona3.obtenerPeso());
        System.out.println("Informacion general "+persona3);
    }
}
