package ejercicio3;

public class Area {
    private double radio;

    public double getRadio(){
        return  radio;
    }
    public void setRadio(double radio){
        this.radio= radio;
    }
    public double obtenerArea(){
        return Math.PI*Math.pow(getRadio(),2);
    }

}
