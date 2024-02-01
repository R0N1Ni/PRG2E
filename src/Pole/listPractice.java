package Pole;

import java.util.ArrayList;
import java.util.Scanner;

public class listPractice {
    public static void main(String[] args) {
        // zeptejte se na telefoni cisla
        //zadani ukonci zadanim -1
        // vypiste vce cr cisla
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadavej telefoni cisla, ukoncis zadanim -1");
        String phoneNumber = "";
        // dokud nezada -1
        while (!phoneNumber.equals("-1")){
            phoneNumber = sc.nextLine(); // zadej dalsi string
            list.add(phoneNumber);
        }
        System.out.println("Zadano: " + list);

        //vypsat ty ceske:
        String  currentNumber;
        System.out.println("Ceska cisla: ");
        boolean check = true;
        for (int i = 0; i <list.size() ; i++) {
            currentNumber = list.get(i);
            check = true;

            for (int j = 1; j < currentNumber.length(); j++) {
                char currentSymbol = currentNumber.charAt(j);
                //overi ze se jedna o cislo
                if (!Character.isDigit(currentSymbol)){
                    check = false;
                    break;
                }
            }
            if (currentNumber.startsWith("+420") &&
                    currentNumber.length() == 13 && check == true){
                System.out.println(currentNumber);
            }
        }
    }
}
