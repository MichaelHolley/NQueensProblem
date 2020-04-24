package NQueensSolver;

import java.util.Scanner;

public class Main {
    /**
     * Starting point
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfQueens = 0;
        while (numberOfQueens <= 0) {
            System.out.print("Gib die Größe des Spielfelds an:\t");
            numberOfQueens = scan.nextInt();
        }
        new NQueensSolver(numberOfQueens);
    }
}
