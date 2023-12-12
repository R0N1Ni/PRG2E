package Strings;

import java.util.Scanner;

public class Priklady {
    public static void main(String[] args) {
        //1. cviceni
//        String[] users = {"Long", "Filip", "Vitek"};
//        String username = "Filip";
//        boolean jeTam = false;
//
//
//
//        for (int i = 0; i < users.length; i++) {
//            if (users[i].equals(username)){
//                jeTam = true;
//                break;
//            }
//        }
//
//        if (jeTam == true) {
//            System.out.println("Nachazi se tam");
//        } else {
//            System.out.println("neni tam");
//        }
//
//        //2. cviceni
//        String text = "helo";
//        boolean zdvoj = false;
//        for (int i = 0; i < text.length()-1; i++) {
//            System.out.println("i: " + i + " - cmp " + text.charAt(i) + " " + text.charAt(i+1) );
//            if (text.charAt(i) == text.charAt(i+1)){
//                zdvoj = true;
//                System.out.println("Ano");
//                break;
//            }
//        }
//        if (zdvoj == false) {
//            System.out.println("Ne");
//
//        }
//
//
//        // palindromy
//        String test = "oko";

//        StringBuilder sb = new StringBuilder(test);
//        sb.reverse().toString().equals(test);
//        System.out.println(sb);

//        String a = "Hello";
//        String b = "world";
//        String c = a + b;
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello");
//        sb.append("world");
//
//        String d = sb.toString();

        // 3. priklad
//        String oppositeCase = "Filip ma masivni pero";
//        String result = "";
//        for (int i = 0; i < oppositeCase.length(); i++) {
////             i = 1
//            if (i % 2 == 0  ){
//                String tmp = String.valueOf(oppositeCase.charAt(i));
//                String tmp2 = tmp.toUpperCase();
//                result = result + tmp2 ; // = F
//
//            } else {
//                String tmp = String.valueOf(oppositeCase.charAt(i)); // F
//                String tmp2 = tmp.toLowerCase();
//                result = result + tmp2; // =
//            }
//        }
//        System.out.println(result);
//
//      // 4. priklad
//       String words = "Filip ma masivni pero";
//
//       String[] split = words.split(" ");
//        System.out.println("Veta ma " + split.length + " slov");

        // 5. priklad
//        String[] poleJmen = {"Jan Kratky", "Hoang Khoi Nguyen", "Tim"};
//        String longest = "";
//        for (int i = 0; i < poleJmen.length - 1; i++) {
//            if (poleJmen[i].length() > poleJmen[i + 1].length()) {
//                longest = poleJmen[i];
//            } else {
//
//                longest = poleJmen[i + 1];
//            }
//        }
//        System.out.println("Nejdelsi jmeno je " + longest);
//
        // 6. priklad
//        String number = "123456";
//        String result = "";
//        for (int i = 0; i < number.length(); i++) {
//            String tmp = String.valueOf(number.charAt(i));
//            result = tmp + result;
//        }
        // alternativni zpusob
//        for (int i = number.length() - 1; i >= 0; i--) {
//            String tmp = String.valueOf(number.charAt(i));
//            result = result + tmp;
//    }

        //7. priklad
        Scanner sc = new Scanner(System.in);
        String name = "gayPorn";
        String tecka = ".";
        System.out.println("Zadejte typ souboru");
        String fileName = name + tecka + sc.nextLine();
        System.out.println(fileName);
        }
    }

