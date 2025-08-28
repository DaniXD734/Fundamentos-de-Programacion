import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();

        boolean resultado = (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
