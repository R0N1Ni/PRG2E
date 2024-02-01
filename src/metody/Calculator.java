package metody;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        boolean ok = true;
        while (ok) {
            ok = pocitejSpravne();
        }
    }

    public static boolean pocitejSpravne() {
        double vysledek = 0;
        double cislo1 = cisloOdUzivatele();
        String operace = operace();
        double cislo2 = cisloOdUzivatele();

        switch (operace) {
            case "+": {
                vysledek = scitani(cislo1, cislo2);
                break;
            }
            case "-": {
                vysledek = odecitani(cislo1, cislo2);
                break;
            }
            case "*": {
                vysledek = nasobeni(cislo1, cislo2);
                break;
            }
            case "/": {
                vysledek = deleni(cislo1, cislo2);
                break;
            }
            default: {
                System.out.println("Kokote");
                return false;
            }
        }
        System.out.println(cislo1 + " " + operace + " " + cislo2 + " = " + vysledek);
        System.out.println("-----------------------" + "\n");
        return true;
    }

    public static double scitani(double a, double b) {
        return a + b;
    }

    public static double odecitani(double a, double b) {
        return a - b;
    }

    public static double nasobeni(double a, double b) {
        return a * b;
    }

    public static double deleni(double a, double b) {
        return a / b;
    }

    public static double cisloOdUzivatele() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte cislo: ");
        double cislo = sc.nextDouble();
        return cislo;
    }
    public static String operace() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte operaci: ");
        return sc.nextLine();
    }
}