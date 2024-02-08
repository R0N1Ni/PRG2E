package List;

import java.util.ArrayList;
import java.util.Scanner;

public class ListInput {
    public static void main(String[] args) {
        //priklad: uzivatel zadava prvky do pole
        // zadavani ukonci zadanim -1
        //vypiste vse co je v poli

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj cisla, ukoncis zadanim -1");
        int input = sc.nextInt();
        ArrayList<Integer> number = new ArrayList<>();
        while (input != -1){
            number.add(input);
            input = sc.nextInt();
        }
        System.out.println("Zadano: ");
        System.out.println(number);
    }
}
