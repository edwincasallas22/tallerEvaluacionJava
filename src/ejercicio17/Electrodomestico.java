package ejercicio17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Electrodomestico {

    private final double PRECIO_BASE = 100;
    private final String COLOR_BASE = "blanco";
    private final char CONSUMO_BASE = 'F';
    private final int PESO_BASE = 5;

    protected double precioBase;
    private String color;
    private char consumo;
    private int peso;
    private final List<Character> caracterConsumo = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');
    private final List<String> colorElec = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");
    private final List<Double> precios = Arrays.asList(100.0, 80.0, 60.0, 50.0, 30.0, 10.0);

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = (precioBase == 0) ? PRECIO_BASE : precioBase;
        this.peso = peso;
        this.color = COLOR_BASE;
        this.consumo = CONSUMO_BASE;
    }

    public Electrodomestico(double precioBase, String color, char consumo, int peso) {
        this.precioBase = (precioBase == 0) ? PRECIO_BASE : precioBase;
        this.color = comprovarColor(color.toLowerCase());
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
        precioFinal();
    }

    private char comprobarConsumoEnergetico(char consumoElec) {
        List<Character> res = caracterConsumo.stream().filter(caracter -> caracter.equals(consumoElec)).collect(Collectors.toList());
        return (res.isEmpty()) ? CONSUMO_BASE : res.get(0);
    }

    private String comprovarColor(String colorElegido) {
        List<String> colorRes = colorElec.stream().filter(caracter -> caracter.equals(colorElegido)).collect(Collectors.toList());
        return (colorRes.isEmpty()) ? COLOR_BASE : colorRes.get(0);
    }

    protected double precioFinal() {
        this.precioBase += calcularPrecioConsumo() + calcularPrecioPorTamano();
        return this.precioBase;
    }

    private double calcularPrecioConsumo() {
        int posicion = caracterConsumo.indexOf(this.consumo);
        return (posicion < 0) ? 0.0 : precios.get(posicion);
    }

    private double calcularPrecioPorTamano() {
        if (peso < 19) {
            return 10.0;
        } else if (peso < 49) {
            return 50.0;
        } else if (peso < 79) {
            return 80.0;
        } else {
            return 100.0;
        }
    }


    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public int getPeso() {
        return peso;
    }
}