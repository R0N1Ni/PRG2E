package testStrings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class prvniUkol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte heslo podle podminek");
        String heslo = sc.nextLine();
        int check = 0;
        if (heslo.length() >= 8){
            System.out.println("Delka je ok");
            check++;
        }
        if (heslo.charAt(0) == 'H'){
            System.out.println("H na zacatku ");
            check++;
        }
        for (int i = 0; i < heslo.length(); i++) {
            if (heslo.charAt(i) == '*'){
                System.out.println("Hvezdicka v hesle ");
                check++;
            }
        }
        if (check >2) {
        System.out.println(heslo + " Je ok");
        } else {
            System.out.println("posral si to");
        }

    }
}
