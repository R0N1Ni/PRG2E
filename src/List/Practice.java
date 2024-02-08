package List;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // uzivatel zadava userNames
        //zadavani ukonci zadanim konec
        //jmena musi byt unikatni
        Scanner sc = new Scanner(System.in);
        ArrayList<String> userNames = new ArrayList<>();
        System.out.println("Zadej jmena, ukoncis zadanim konec ");
        String input = sc.nextLine();
        while (!input.equals("konec")){
            if (userNames.contains(input)){
                System.out.println("Jmeno uz tam je");
            } else {
                userNames.add(input);
                System.out.println("Pridano: " + input);
            }
            input = sc.nextLine();

        }
        System.out.println("Zadano: " + userNames);


        //vygenerujte 10 random cisel
        //interval 1-15
        //musi byt unikatni a ulozene

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        int random;
        int count = 0;
        while (uniqueNumbers.size()!=10){
            random = (int) (Math.random()*15+1);
            if(!uniqueNumbers.contains(random)){
                uniqueNumbers.add(random);
            }
            count++;
        }
        System.out.println(uniqueNumbers);
        System.out.println("vygenerovano cisel: " + count);
    }
}
