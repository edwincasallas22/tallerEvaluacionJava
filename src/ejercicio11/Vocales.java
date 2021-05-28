package ejercicio11;

import java.util.Locale;

public class Vocales {
    String fraseNueva;
    int contA = 0;
    int contE = 0;
    int contI = 0;
    int contO = 0;
    int contU = 0;

    public Vocales(String fraseNueva){
        this.fraseNueva = fraseNueva;
    }

    public void obtenerVocales(){

        for (int i = 0; i< fraseNueva.length(); i++){
            char fraseMin = fraseNueva.toLowerCase().charAt(i);
            switch (fraseMin){
                case 'a':
                    contA ++;
                    break;
                case 'e':
                    contE ++;
                    break;
                case 'i':
                    contI ++;
                    break;
                case 'o':
                    contO ++;
                    break;
                case 'u':
                    contU ++;
                    break;

            }
        }
    }

}
