package ejercicio17;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Lavadora(150, 50);
        electrodomesticos[1] = new Electrodomestico(150, "rojo", 'B', 20);
        electrodomesticos[2] = new Television(150, "negro", 'A', 10, 50, true);
        electrodomesticos[3] = new Lavadora(200, "gris", 'D',10,20 );
        electrodomesticos[4] = new Electrodomestico(180, 50);
        electrodomesticos[5]= new Television(150, "negro",'F',10,50,true);
        electrodomesticos[6]= new Electrodomestico(150,"negro",'C',20 );
        electrodomesticos[7]= new Electrodomestico(190, 50);
        electrodomesticos[8]= new Television(150, "gris",'A',10,50,false);
        electrodomesticos[9]= new Lavadora(200, "blanco",'A',10,30);


        Main.sumaLavadora(electrodomesticos);
        Main.sumaTelevisor(electrodomesticos);
        Main.sumaElectrodomestico(electrodomesticos);
    }

    public static void sumaLavadora(Electrodomestico[] elec){
        Arrays.stream(elec).filter(ele -> ele instanceof Lavadora).forEach(lav -> System.out.println("precio de lavadora "+lav.precioFinal()));
    }
    public static void sumaTelevisor(Electrodomestico[] elec){
        Arrays.stream(elec).filter(ele -> ele instanceof Television).forEach(lav -> System.out.println("precio de televisor "+lav.precioFinal()));
    }
    public static void sumaElectrodomestico(Electrodomestico[] elec){
        Arrays.stream(elec).filter(ele -> ele instanceof Electrodomestico).forEach(lav -> System.out.println("precio de electrodomestico "+lav.precioFinal()));
    }
}