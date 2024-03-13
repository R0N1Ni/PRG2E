package metody;

import java.util.Arrays;

public class Ukoly {
    public static void main(String[] args) {
//        int[] pole = {1,3,23,5346,5,546,54,57,7879,98};
//        int max = getMax(pole);
//        System.out.println(max);
//        int pocetDni = dayCount(40,2);
//        System.out.println(pocetDni);
//        textAnalysis("Dneska je pekne.");
//        triangleArea()
//        System.out.println(digitsSum(23));
       hosts("123.124.12.52/25");
    }




    public static int getMax (int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;

    }
    public static int dayCount (int day, int month){
        int[] monthsDays = {31,28,31,30,31,30,31,31,30,31,30,31};
//        if (day > monthsDays[month-1])
//        {
//            System.out.println("kys");
//        }
            for (int i = 0; i < month - 1; i++) {
                day += monthsDays[i];

            }

        return day;
    }
    public static int dayCount (int day, int month, int year){
        int[] monthsDays = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0; i < month - 1; i++) {
            day += monthsDays[i];
        }

        if (isLeapYear(year) && month > 1){
            day += 1;
        }

        return day;
    }
    public static boolean isLeapYear (int year){
        return year % 4 == 0 && year % 100 !=0;
    }
    public static void textAnalysis (String text){
        int words = 1;
        int sentences = 0;
        System.out.println(text.length());
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' '){
                words++;
            }
            if (text.charAt(i) == '.'){
                sentences++;
            }
        }
        System.out.println("Pocet slov: " + words);
        System.out.println("Pocet vet: " + sentences);


    }
    public static boolean isTriangle (int a, int b, int c){
        if (a + b > c && a + c > b && c + b > a){
            return true;
        }else {
            return false;
        }

    }
    public static int triangleArea (int a, int b, int c){
        boolean triangle = isTriangle(4,5,6);
        if (triangle == false){
            return -1;
        }else {
            return (a * b) / 2;
        }


    }
    public static int digitsSum(int number){
        String cislo = Integer.toString(number);
        int vysledek = 0;
        for (int i = 0; i < cislo.length(); i++) {
           vysledek += ((int)cislo.charAt(i));
        }
        return vysledek;
    }
    public static void hosts (String ip){
        String [] CastiIPAdresy = ip.split("/");
        int prefix = Integer.parseInt(CastiIPAdresy[1]);
        int volnyBity = 32- prefix;
        int moznyAdresy = ((int) Math.pow(2,volnyBity));
        System.out.println(moznyAdresy);
    }

}

