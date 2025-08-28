import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, mayor = Integer.MIN_VALUE;
        boolean hayNegativo = false;

        System.out.println("Introduce números (termina con -99): ");
        while ((num = sc.nextInt()) != -99) {
            if (num > mayor) mayor = num;
            if (num < 0) hayNegativo = true;
        }

        System.out.println("Número mayor: " + mayor);
        if (hayNegativo) System.out.println("Se ingresaron números negativos.");
        sc.close();
    }
}
