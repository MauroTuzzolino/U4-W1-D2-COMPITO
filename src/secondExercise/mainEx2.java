package secondExercise;
import java.util.Scanner;

public class mainEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero tra 0 e 3: ");
        int numero = scanner.nextInt();

        switchMethod(numero);

        scanner.close();
    }

    public static void switchMethod(int num){
        switch (num) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Due");
                    break;
                case 3:
                    System.out.println("Tre");
                    break;
                default:
                    System.out.println("Errore: numero non valido (deve essere tra 0 e 3)");
                    break;
        }

    }
}
