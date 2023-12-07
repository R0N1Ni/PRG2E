package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        char c1 = 'f';
        char c2 = 'i';
        char c3 = 'l';
        char c4 = 'i';
        char c5 = 'p';
        char[] string = {};

        String s = "filip";

        char input = 'A';
        input ='9';
        System.out.println(input + 1);
        input ='\n';//odradkovani
        System.out.println("hello" + input + "world");
        input = '\t';//tabulator
        System.out.println("hello" + input + "world");
        //porovnani?
        char a = 'a';
        char A = 'A';
        if (a==A){
            System.out.println("Same");
        }

        String hello = "Hello!";
        Scanner sc = new Scanner(System.in);
        String ehlo = sc.nextLine();
        System.out.println("Zadal jsi " + ehlo);
        // !! u Stringu se nikdy nepouziva ==
        if (hello == ehlo){
            System.out.println("They're the same");
        }
        //pouziva se
        if (hello.equals(ehlo)){
            System.out.println("They're the same (equals)");
        }

        String showcase = "Obsah \t\t str\tingu";
        System.out.println(showcase);
        String more = showcase + "Hello";
        System.out.println(more);
        //Java je case sensitive
        boolean isSame ="hello".equals("Hello");
        String helloTest = "hello";
        helloTest.equals("Neco dalsiho");//rovna se
        String upperHello = helloTest.toUpperCase();
        // po zavolani se puvodni nezmeni
        System.out.println(helloTest);
        System.out.println(upperHello);
        System.out.println("Pismeno na 2: " + helloTest.charAt(2));
        System.out.println("Kde je 'l'? " + helloTest.indexOf('l'));
        System.out.println("Kde je 'l'? " + helloTest.lastIndexOf('l'));


    }
}
