package thirdExercise;
import java.util.Scanner;

public class mainEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "";

        while (true) {
            System.out.print("Inserisci una stringa (digita :q per uscire): ");
            str = scanner.nextLine();

            if (str.equals(":q")) {
                System.out.println("Programma terminato.");
                break;
            }

            String risultato = whileMethod(str);
            System.out.println("Stringa separata: " + risultato);
        }

        scanner.close();
    }

    public static String whileMethod(String str) {
        String risultato = "";
        int i = 0;
        while (i < str.length()) {
            risultato += str.charAt(i);
            if (i < str.length() - 1) {
                risultato += ",";
            }
            i++;
        }
        return risultato;
    }
}
