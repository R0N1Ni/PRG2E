package vlastni;

import java.util.Scanner;

public class plop {
    public static void main(String[] args) {
        System.out.println("Zadavej cisla, zadavani ukoncis zadanim -1");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input != -1){
            input = sc.nextInt();
            if (input % 2 ==0){
                System.out.println(input);
            }


        }

        System.out.println("Zadej pocet pater");
        input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
