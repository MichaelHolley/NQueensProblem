package NQueensSolver;

import java.util.Arrays;

/**
 * Class for solving the n-Queens-Problem
 */
public class NQueensSolver {
    private int size;
    private int solutions;

    /**
     * Constructor initialized with board-size and starting the solving-process.
     * @param size width and height of the board
     */
    public NQueensSolver(int size) {
        this.size = size;
        this.solutions = 0;
        solve();
    }

    /**
     * Starting point of solving the n-Queens-Problem
     */
    public void solve() {
        int[] positions = new int[this.size];
        Arrays.fill(positions, -1);
        insertQueen(positions, 0);
        System.out.println(solutions + " solutions found!");
    }

    /**
     * Recursive Method that calls itself to place a queen in the next row, escaping when rowIndex equals the board's size. Printing the board to the console when a solutions was found.
     * @param positions Integer-array storing the columnIndex where queens are place (-1 if row is empty)
     * @param currentRowIndex index indicating in which row a queen will be placed on method execution
     */
    private void insertQueen(int[] positions, int currentRowIndex) {
        if (currentRowIndex == this.size) {
            printBoard(positions);
            this.solutions++;
        } else {
            for (int columnIndex = 0; columnIndex < this.size; columnIndex++) {
                if (checkPosition(positions, currentRowIndex, columnIndex)) {
                    positions[currentRowIndex] = columnIndex;
                    insertQueen(positions, currentRowIndex + 1);
                }
            }
        }
    }

    /**
     * Check if a certain row is a valid option for placing a queen for a specific row.
     * @param positions Integer-array storing the columnIndex where queens are place (-1 if row is empty)
     * @param occupiedRows number of rows already filled with queens
     * @param columnIndex index of the column which is currently tested
     * @return <b>true</b> if the the specific columnIndex is a valid position for a queen
     */
    private boolean checkPosition(int[] positions, int occupiedRows, int columnIndex) {
        for (int i = 0; i < occupiedRows; i++) {
            if ((positions[i] == columnIndex) || (positions[i] - i == columnIndex - occupiedRows) || (positions[i] + i == columnIndex + occupiedRows)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Prints the board for given positions-parameter
     * @param positions Integer-array storing the columnIndex where queens are place (-1 if row is empty)
     */
    private void printBoard(int[] positions) {
        for (int rowIndex = 0; rowIndex < this.size; rowIndex++) {
            String line = "";
            for (int columnIndex = 0; columnIndex < this.size; columnIndex++) {
                if (positions[rowIndex] == columnIndex)
                    line += "Q ";
                else
                    line += "_ ";
            }
            System.out.println(line);
        }
        System.out.println();
    }

    /**
     * Return the total of solutions.
     * @return total of solutions
     */
    public int getSolutions() {
        return solutions;
    }
}
