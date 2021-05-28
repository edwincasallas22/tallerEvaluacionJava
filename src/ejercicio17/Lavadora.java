package ejercicio17;

public class Lavadora extends Electrodomestico {

    private final double CARGA_BASE = 5;
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumo, int peso, double carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        super.precioFinal();
        return this.precioBase += calcularPrecioCarga();
    }

    private double calcularPrecioCarga() {
        return (this.carga >= 30) ? 50 : 0;
    }

    public double getCarga() {
        return carga;
    }
}