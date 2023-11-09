package loops;

import java.util.Arrays;

public class PoleCviceni {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 123, 21, 15};
        int[] emptyArray = new int[15];

        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = (i + 1) * 5;
        }
        System.out.println(Arrays.toString(emptyArray));


        //vypis emptyArray pozpatku
        for (int i = emptyArray.length - 1; i >= 0; i--) {
            System.out.println(emptyArray[i]);
        }


        //kolikrat se v poli vyskytne cislo delitelne 10
        int counter = 0;
        for (int i = 0; i < emptyArray.length; i++) {
            if (emptyArray[i] % 10 == 0) {
                counter++;
                System.out.println(emptyArray[i]);
            }
        }


        //spocitej sumu v poli
        int sum = 0;
        for (int i = 0; i < emptyArray.length; i++) {
            sum += emptyArray[i];
            // sum = sum + emptyArray[i]

        }
        System.out.println("Total sum: " + sum);


        //vypis zig-zag
        for (int i = 0; i < emptyArray.length/2; i++) {
            System.out.println(emptyArray[i]);
            System.out.println(emptyArray[emptyArray.length-1-i]);
            }
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random()*50+1);
        }
        System.out.println(Arrays.toString(randomNumbers));
                
        }
    }

