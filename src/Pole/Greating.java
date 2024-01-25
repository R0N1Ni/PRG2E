package Pole;

import java.util.Scanner;

public class Greating {
    public static void main(String[] args) {
        //int[][] matrix = new int[][]{{1,2,3}, {6,5,4}};
        int[][] matrix = new int[10][10];
        // varianta 1
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 90 + 10);
////                matrix[i][j] = counter;
////                counter ++;
                //  matrix[i][j] = j + 1 + i * 10;

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " \t ");
            }
            System.out.println();
        }
        int soucet = 0;
        for (int i = 0; i < matrix.length; i++) {
            soucet = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                soucet += matrix[i][j];
            }
            double average = (soucet / matrix[i].length);
            System.out.println("Prumer " + (i + 1) + ": " + average);
        }
        //uzivatel zada sloupec, vypiste jeho soucet
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo sloupecku");
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            //vypis pouze druhy radek:
            //  System.out.print(matrix[1][i] + " ");
            //vypis pouze druhy sloupec
            // System.out.println(matrix[i][1]);
            System.out.println(matrix[i][input - 1]);
            sum += matrix[i][input - 1];
        }
        System.out.println("Suma: " + sum);

        System.out.println("Trojuhelnik:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Trojuhelnik:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length-1; j > matrix[i].length-i ; j--) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}