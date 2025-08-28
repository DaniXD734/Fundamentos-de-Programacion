public class Ejercicio2 {
    public static void main(String[] args) {
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) sumaPares += i;
            else sumaImpares += i;
        }

        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }
}
