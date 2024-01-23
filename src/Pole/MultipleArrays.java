package Pole;

import java.util.Arrays;

public class MultipleArrays {
    public static void main(String[] args) {
        int [] array = {2,5,3,6,8,4,5};
        int [][] moreArrays = {{1,2,3}, {4,5,6}, {7,8,9}};

        int [][] coordinates = {{2,3}, {4,5}, {9,6}, {2,5}};

        System.out.println(moreArrays[1][2]);

        //vygenerovani pole

        int rows = 10;
        int cols = 10;

        int [][] sequence = new int[10][10];
        int counter = 1;
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence[i].length; j++) {
             sequence[i][j] = counter;
             counter++;

            }
        }

        //vypsani pole
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence[i].length; j++) {
                System.out.print(sequence[i][j] + " \t ");
            }
            System.out.println();//odradkovani
        }

        //vypsani pole pozpatku
        for (int i = sequence.length - 1; i >= 0; i--) {
            for (int j = sequence[i].length - 1; j >= 0; j--) {
                System.out.print(sequence[i][j] + " \t ");
            }
            System.out.println();//odradkovani
        }

    }
}
