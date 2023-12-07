package Strings;

import java.util.Scanner;

public class Procvicovani {
    public static void main(String[] args) {
        // nacti string od uzivatele
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej string: ");
        String input = sc.nextLine();
        // je dlouhy aspon 8 znaku
        if (input.length() > 7){
            System.out.println("Input OK");
        }
        // overi rodne cislo
        // overi = znak '/'
        // pocet znaku = 11
        // vypis zda se jedna o muze ci zenu

        String rodneCislo = "000209/1245";
        if (rodneCislo.charAt(6) == '/'){
            System.out.println("/ je OK");
            if(rodneCislo.length() == 11){
                System.out.println("Delka OK");
                if (rodneCislo.charAt(2) == '0' || rodneCislo.charAt(2) == '1'){
                    System.out.println("Jedna se o muze");
                } else {
                    System.out.println("Jedna se o zenu");
                }
            }
        }
        //Pripravit string heslo
        //Overit, zda uzivatel heslo uhodl
        String password = "secret";
        System.out.println("Zadejte heslo");
        input = sc.nextLine();
        //equals porovnava zda jsou stejne
        if (input.equals(password)){
            System.out.println("Spravne zadane heslo");
        }else {
            System.out.println("jses pica");
        }


        //hledani v poli Strings
        String[] passwords = {"bagr","toi toi", "mamma mia!"};
        System.out.println("Zadej heslo");
        input = sc.nextLine();
        for (int i = 0; i < passwords.length; i++) {
            if (passwords[i].equals(input)){
                System.out.println("Uhadl jste heslo");
                break;
            }

        }

        //prevod textu na velka mala pismena
        //Java je case sensitive

        //uzivatel zda text, vypis je velkymi pismeny
        System.out.println("Zadej text: ");
        input = sc.nextLine();
        String upperText = input.toUpperCase();
        System.out.println(input + " byl preveden na " + upperText);


        //porovnojte, zda jsou stejna bez ohledu na velikost pismen
        //hello = hELlO budou stejne
        String first = "hello";
        String second = "hELlo";
        System.out.println("Jsou stejne? " + first.equals(second));
        System.out.println("Jsou stejne? " + first.equalsIgnoreCase(second));
        //Alternativni a zbytecne slozite

    }
}
