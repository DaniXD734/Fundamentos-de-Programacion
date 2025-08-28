import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu velocidad: ");
        int velocidad = sc.nextInt();
        sc.nextLine();

        System.out.print("¿Es tu cumpleaños? (si/no): ");
        String respuesta = sc.nextLine().toLowerCase();

        boolean cumple = respuesta.equals("si");

        if (cumple) velocidad -= 5;

        if (velocidad <= 60) {
            System.out.println("Resultado: 0 (sin multa)");
        } else if (velocidad <= 80) {
            System.out.println("Resultado: 1 (multa pequeña)");
        } else {
            System.out.println("Resultado: 2 (multa grande)");
        }

        sc.close();
    }
}
