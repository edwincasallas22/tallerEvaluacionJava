package ejercicio17;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Lavadora(80, 50);
        electrodomesticos[1] = new Electrodomestico(70, "rojo", 'B', 40);
        electrodomesticos[2] = new Television(130, "negro", 'A', 13, 50, true);
        electrodomesticos[3] = new Lavadora(202, "gris", 'D',14,20 );
        electrodomesticos[4] = new Electrodomestico(160, 80);
        electrodomesticos[5]= new Television(120, "negro",'F',10,50,true);
        electrodomesticos[6]= new Electrodomestico(150,"negro",'C',20 );
        electrodomesticos[7]= new Electrodomestico(230, 50);
        electrodomesticos[8]= new Television(230, "gris",'A',16,50,false);
        electrodomesticos[9]= new Lavadora(190, "blanco",'A',20,30);


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