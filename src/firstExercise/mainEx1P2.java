package firstExercise;
import java.util.Scanner;

public class mainEx1P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un anno: ");
        int anno = scanner.nextInt();

        if (annoBisestile(anno)) {
            System.out.println(anno + " è bisestile");
        } else {
            System.out.println(anno + " non è bisestile");
        }

        scanner.close();
    }


    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
