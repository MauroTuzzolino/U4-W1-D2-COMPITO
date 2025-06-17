package firstExercise;
import java.util.Scanner;

public class mainEx1P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digitare una stringa!");
        String stringaProva = scanner.nextLine();

        stringaPariDispari(stringaProva);
    };

    public static void stringaPariDispari(String stringa){

        int numeroCaratteri = stringa.length();

        if(numeroCaratteri % 2 == 0){
            System.out.println("La stringa ha lunghezza pari (true)");
        } else {
            System.out.println("La stringa ha lunghezza dispari (false)");
        }
    }
}
