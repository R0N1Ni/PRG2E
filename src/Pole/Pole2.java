package Pole;

public class Pole2 {
    public static void main(String[] args) {
        double[] doubleArray = {15.2, 123.1, 4.2, 6.9, 94.2, 7894.1};
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);

        }
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] < 0){
                System.out.println(doubleArray[i]);
               }
            }
                double arraySum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            arraySum = arraySum + doubleArray[i];

        }
        System.out.println("Sum of array: " + arraySum);
        System.out.println("Average value: " + (arraySum / doubleArray.length)); //prumer v poli



        double[] points = {-2,-1,0,1,2};
        for (int i = 0; i < points.length; i++) {
            System.out.println("body: ");
            System.out.println("x = " + points[i]);
            double y = 2*points[i] +5;
            System.out.println("y = " + y);

        }
        }
    }

