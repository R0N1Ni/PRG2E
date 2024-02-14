package Pole;

import java.util.Scanner;

public class poleTest {
    public static void main(String[] args) {
       //2. ukol
        int [] arr = {0,1,2,4,3,5,6,7};
//        int even = 0;
//        int odd = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 ==0){
//                even += arr[i];
//            }
//            else {
//                odd += arr[i];
//            }
//        }
        //3. ukol
       // double a = Math.sqrt(10);


        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        int input = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if ( input == arr[i]){
                System.out.println("Na indexu: " + i);
            }
        }
    }

}
