import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int c = sc.nextInt();

        int ab = a + b, bc = b + c, ac = a + c;
        int resultado;

        if (ab == 10 || bc == 10 || ac == 10) resultado = 10;
        else if (ab == bc + 10 || ab == ac + 10) resultado = 5;
        else resultado = 0;

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
