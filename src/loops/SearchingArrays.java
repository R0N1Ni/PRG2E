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


    }
}
