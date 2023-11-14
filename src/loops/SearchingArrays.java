package loops;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingArrays {
    public static void main(String[] args) {
        int [] arr = {456,32,-21,11,-157,871,654,1};
        int [] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1 ;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr1[i] < min){
                min = arr1[i];
            }
        }
        System.out.println("Min: " + min);
        //seradi cele pole vzestupne
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //fillArray - napln pole od uzivatele
        int[] emptyArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < emptyArray.length; i++) {
            System.out.println("Zadej cislo");
            emptyArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(emptyArray));


        int [] switches = {5,6,9};
        int temp = switches[0];
        switches [0] = switches [2];
        switches[2] = temp;

        int [] pole ={15,9847,651,654,65,136,1321} ;
        for (int i = 0; i < pole.length - 1; i++) {
            if (pole[i] > pole [i+1]){
                System.out.println("Neni serazeno");
                break;
            }

        }
//        int [] array = new int[10];
//        while (){
//            System.out.println("Zadej cisla od 1-10");
//            if ();
//        }
    }
}
