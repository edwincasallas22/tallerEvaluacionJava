package ejercicio16;

import java.util.function.Predicate;

public class Persona {
    private final String MASCULINO = "hombre";
    private final String FEMENINO = "mujer";
    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private String sexo = MASCULINO;
    private double peso = 70;
    private double altura = 1.55;


    private final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    Persona (){

    }
    Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double calcularIMC(){
        double imc = (getPeso()/(Math.pow(getAltura(),2)));
        if(imc < 20){
            return -1;
        }else  if (20 < imc && imc < 25){
            return 0;
        }else if(imc >25){
            return  1;
        }
        return 0;
    }
    public String obtenerPeso(){
        double v = calcularIMC();
        if (v == 0) {
            return "Esta debajo de su peso ideal";
        } else if (v == 1) {
            return "Esta en sobrepeso";
        }
        return "peso ideal";

    }


    public boolean esMayorDeEdad(){
        if(getEdad()>18){
            return true;
        }
        return false;
    }
    public String mayorEdad(){
        String mayor =(esMayorDeEdad())? "Es mayor de edad":"No es mayor de edad";
        return mayor;
    }

    public String comprobarSexo(char sexo) {
        return (sexo == 'M') ? FEMENINO : MASCULINO;
    }
    public String toString(){
        return "Nombre: "+getNombre()+
                ", Edad: "+getEdad()+
                ", DNI: "+ getDNI()+
                ", Sexo: "+ this.sexo+
                ", Peso: "+ getPeso()+
                ", Altura: "+ getAltura();
    }
    public void generarDNI() {
        int num = (int) (100000000 * Math.random());
        int resto = num % 23;
        this.DNI = "" + num + "" + letras[resto];
    }
}
