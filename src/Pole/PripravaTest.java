package Pole;

import java.util.ArrayList;
import java.util.Scanner;

public class PripravaTest {
    public static void main(String[] args) {
//        cv1();
        cv2();
//        cv3();
//        cv4();
//cv5();
    }

    public static void cv1() {
        ArrayList<Integer> arrayList = new ArrayList<>() {
        };
        int[] pole = randomPole(5, 10);

        for (int i = 0; i < pole.length; i++) {
            int cislo = pole[i];
            arrayList.add(cislo);
        }
        System.out.println(arrayList);

//        System.out.println(arrayList.reverse());

        for (int i = pole.length - 1; i >= 0; i--) {
            System.out.println(i + ".");
            System.out.println(arrayList.get(i));
        }


    }

    public static void cv2() {
        int[][] twoDpole = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
        };
        System.out.println("Zadejte cislo sloupce");
        int sloupec = cisloOdUzivatele();
        int soucet = 0;
        for (int i = 0; i < twoDpole.length; i++) {
            int[] radek = twoDpole[i];
            int cislo = radek[sloupec];
            soucet += cislo;
        }
        System.out.println(soucet);
    }

    public static void cv3() {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Pridavejte spanelska slova");
        String slovo = slovoOdUzivatele();
        arrayList.add(slovo);
        while (!slovo.equals("fin")) {
            if (slovo.startsWith("el ") || slovo.startsWith("la ") || slovo.startsWith("un ")) {
                arrayList.add(slovo);
            }
            System.out.println("Pridavejte spanelska slova");
            slovo = slovoOdUzivatele();
        }
        System.out.println(arrayList);
    }
    public static void cv4(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int counter = 0;
        int [] cisla = randomPole(100,100);
        for (int i = 0; i < 100; i++) {
                arrayList.add(cisla[i]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)< 50 ) {
                arrayList.remove(i);
                counter++;
                i--;
            }
        }
        System.out.println(arrayList);
        System.out.println("Smazano " + counter);
    }
    public static void cv5(){
        int sum = 0;
        int filmy = 0;
        double check = 7.5;
        int[][] dvaDpole = {
                {10,10,10,10,4},
                {1,1,1,1,5},
                {5,5,5,5,5},
                {8,9,10,10,9},

        };
        for (int i = 0; i < dvaDpole.length; i++) {
            int avg;
            int[] radek = dvaDpole[i];
            for (int j = 0; j < dvaDpole[i].length; j++) {
                sum += radek[j];


            }

            System.out.println("suma: " + sum);
            avg = sum / radek.length;
            sum = 0;
            if (avg > check){
                System.out.println("prumer: " + avg);
                filmy++;
                System.out.println("filmy: " + filmy);
            }
        }

    }



        public static int[] randomPole ( int velikostPole, int max){
            int[] pole = new int[velikostPole];

            for (int i = 0; i < pole.length; i++) {
                pole[i] = (int) (Math.random() * max + 1);
            }
            return pole;
        }

        public static int cisloOdUzivatele () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Zadejte cislo: ");
            int cislo = sc.nextInt();
            return cislo;
        }

        public static String slovoOdUzivatele () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Zadejte slovo: ");
            String slovo = sc.nextLine();
            return slovo;
        }
    }

