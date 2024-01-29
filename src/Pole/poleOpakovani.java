package loops;

import java.util.Arrays;
import java.util.Scanner;

public class PoleOpakovani {
    public static void main(String[] args) {
//        cviceni_1();
//        cviceni_2();
//        cviceni_3();
//        cviceni_4();
        cviceni_5();
    }

    public static void cviceni_1() {
        int cisla = cisloOdUzivatele();
        int[] pole = randomPole(cisla, 5);
        System.out.println(Arrays.toString(pole));
    }

    public static void cviceni_2(){
        int counterLi = 0;
        int counterSud = 0;
        int[] pole = randomPole(6, 5);
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] % 2 == 0){
                counterSud += pole[i];
            }else {
             counterLi += pole[i];
            }
        }
        System.out.println("Suda: " + counterSud);
        System.out.println("Licha: " + counterLi);
        System.out.println(Arrays.toString(pole));
    }

    public static void cviceni_3(){
        int[] pole = randomPole(6, 5);
        double[] poleOdmocnin = new double[pole.length];
        for (int i = 0; i < pole.length; i++) {
            poleOdmocnin[i] = Math.sqrt(pole[i]);
        }
        System.out.println(Arrays.toString(pole));
        System.out.println(Arrays.toString(poleOdmocnin));
    }

    public static void cviceni_4(){
        int cislo = cisloOdUzivatele();
        int counter = 0;
        int[] pole = randomPole(6, 100);
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] == cislo){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println(Arrays.toString(pole));
        System.out.println(counter);
    }

    public static void cviceni_5(){
        int pole[] = new int[3];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = cisloOdUzivatele();
        }
        System.out.println(Arrays.toString(pole));
    }

    public static int cisloOdUzivatele() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte cislo: ");
        int cislo = sc.nextInt();
        return cislo;
    }

    public static int[] randomPole(int velikostPole, int max) {
        int[] pole = new int[velikostPole];

        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int) (Math.random() * max + 1);
        }
        return pole;
    }
}
