package TestArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class testArraylist {
    public static void main(String[] args) {
//        cv1();
        cv2();
//        cv3();


    }
    public static void cv1(){
        int [][] body ={
                {35,20,45,50},
                {10,25,14,20},
                {30,35,31,45}
        };

        for (int i = 0; i < body.length; i++) {
            int [] radek = body[i];
            for (int j = 0; j < body[i].length; j++) {
                if (radek[j] >= 30 ) {


                }

            }
        }
    }
    public static void cv2(){
        int [][] dvaDpole = {
                {5,6,7,5},
                {1,3,8,6},
                {2,0,5,4},
                {9,6,3,4}
        };
        System.out.println("Zadejte cislo sloupce");
        int sloupecOdUser  = cisloOdUzivatele();
        int nejmensi = 1000;
        for (int i = 0; i < dvaDpole[sloupecOdUser].length; i++) {
          if (dvaDpole[sloupecOdUser][i]<nejmensi){
              nejmensi = dvaDpole[sloupecOdUser][i];

            }
        }
        System.out.println(nejmensi);
    }
    public static void cv3(){
        ArrayList<String> arrayList= new ArrayList<>(){
        };
        System.out.println("Zadavejte hesla");
        String  heslo = slovoOdUzivatele();
        arrayList.add(heslo);
        while (!heslo.equals("konec")){
            if (heslo.contains("*") && heslo.length()>=8){
                arrayList.add(heslo);
            }
            System.out.println("Zadavajte hesla");
            heslo = slovoOdUzivatele();
        }
        System.out.println(arrayList);
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
