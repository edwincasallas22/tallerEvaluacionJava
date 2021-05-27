package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ProduIva productoIva = new ProduIva();
        System.out.println("Hola, por favor ingrese el precio del producto: ");
        double preInicial = entrada.nextDouble();
        productoIva.setPrecio(preInicial);
        System.out.println("El valor del producto con IVA es: $ " + productoIva.obtenerPrecioTotal());
    }
}
