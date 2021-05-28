package ejercicio13;
import java.time.LocalDateTime;

public class Ejercicio13 {
    public static void main(String[] args) {

            LocalDateTime fechaActual = LocalDateTime.now();
            System.out.println("("+ fechaActual.getYear()+"/"+fechaActual.getMonthValue()+"/"+fechaActual.getDayOfMonth()+")"
                    +" ("+fechaActual.getHour()+":"+fechaActual.getMinute()+":"+fechaActual.getSecond()+")");

    }
}
