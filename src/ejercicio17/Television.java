package ejercicio17;

public class Television extends Electrodomestico {

    private final int PULGADAS_BASE = 20;
    private int pulgadas;
    private boolean tdt = false;

    public Television() {
        this.pulgadas = PULGADAS_BASE;
    }

    public Television(double precioBase, int peso) {
        super(precioBase, peso);
        this.pulgadas = PULGADAS_BASE;
    }

    public Television(double precioBase, String color, char consumo, int peso, int pulgadas, boolean tdt) {
        super(precioBase, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    @Override
    public double precioFinal() {
        super.precioFinal();
        this.precioBase = this.precioBase + (this.precioBase * porcentajePorPulgadas()) + precioConTDT();
        return this.precioBase;
    }

    private double porcentajePorPulgadas() {
        return (this.pulgadas > 40) ? 0.3 : 0.0;
    }

    private double precioConTDT() {
        return (this.tdt) ? 50 : 0;
    }

}