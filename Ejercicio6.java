import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int c = sc.nextInt();

        boolean resultado = (a + b == c || a + c == b || b + c == a);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
