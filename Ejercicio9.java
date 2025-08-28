import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();

        boolean resultado = (n % 3 == 0 ^ n % 5 == 0);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
