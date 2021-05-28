package ejercicio17;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(80,50);
        electrodomesticos[2] = new Electrodomestico(60,"ROJO",'C',27);
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Lavadora(90,12);
        electrodomesticos[5]= new Lavadora(120,"Blanco",'Q',75,40);
        electrodomesticos[6]= new Television();
        electrodomesticos[7]= new Television(200,85);
        electrodomesticos[8]= new Television(150, "gris",'A',10,60,true);
        electrodomesticos[9]= new Lavadora(200, "blanco",'A',10,30);


        Main.sumaLavadora(electrodomesticos);
        Main.sumaTelevisor(electrodomesticos);
        Main.sumaElectrodomestico(electrodomesticos);
    }

    public static Double sumaLavadora(Electrodomestico[] elec ){
        Arrays.stream(elec).filter(ele -> ele instanceof Lavadora).forEach(lav -> System.out.println("precio de lavadora "+lav.precioFinal()));
        return Arrays.stream(elec).filter(x -> x instanceof Lavadora).map(Electrodomestico::precioFinal).reduce((double) 0, Double::sum);
    }
    public static Double sumaTelevisor(Electrodomestico[] elec){
        Arrays.stream(elec).filter(ele -> ele instanceof Television).forEach(lav -> System.out.println("precio de televisor "+lav.precioFinal()));
        return Arrays.stream(elec).filter(x -> x instanceof Television).map(Electrodomestico::precioFinal).reduce((double) 0, Double::sum);
    }
    public static Double sumaElectrodomestico(Electrodomestico[] elec){
        Arrays.stream(elec).filter(ele -> ele instanceof Electrodomestico).forEach(lav -> System.out.println("precio de electrodomestico "+lav.precioFinal()));
        return Arrays.stream(elec).filter(x -> x instanceof Electrodomestico).map(Electrodomestico::precioFinal).reduce((double) 0, Double::sum);
    }
}