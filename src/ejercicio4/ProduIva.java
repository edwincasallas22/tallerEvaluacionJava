package ejercicio4;

public class ProduIva {
    private double precio;
    private double impuestoIva = 0.21;

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double obtenerPrecioTotal(){
        return (getPrecio() + getPrecio()*impuestoIva);
    }
}
