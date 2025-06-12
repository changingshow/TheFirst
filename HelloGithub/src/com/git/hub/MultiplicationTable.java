package com.git.hub;

/**
 * Utility class that prints the classic 9×9 multiplication table.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        printTable();
    }

    /**
     * Outputs the multiplication table with each result padded so the
     * columns stay aligned.
     */
    static void printTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%-2d ", j, i, i * j);
            }
            System.out.println();
        }
    }
}
