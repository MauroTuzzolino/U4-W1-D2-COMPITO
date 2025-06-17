package fourthExercise;
import java.util.Scanner;

public class mainEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        System.out.println("Conto alla rovescia:");
        forMethod(numero);

        scanner.close();
    }

    public static void forMethod(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
