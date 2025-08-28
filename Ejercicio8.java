import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el día (0=Dom, 1=Lun, ... 6=Sáb): ");
        int dia = sc.nextInt();

        System.out.print("¿Estás de vacaciones? (true/false): ");
        boolean vacaciones = sc.nextBoolean();

        boolean finSemana = (dia == 0 || dia == 6);
        String alarma;

        if (vacaciones) {
            if (finSemana) alarma = "Apagada";
            else alarma = "8:00";
        } else {
            if (finSemana) alarma = "9:00";
            else alarma = "6:00";
        }

        System.out.println("La alarma debe sonar a: " + alarma);
        sc.close();
    }
}
