import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int c = sc.nextInt();

        System.out.print("¿Permitir iguales? (true/false): ");
        boolean equalOk = sc.nextBoolean();

        boolean resultado;
        if (equalOk) resultado = (a <= b && b <= c);
        else resultado = (a < b && b < c);

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
