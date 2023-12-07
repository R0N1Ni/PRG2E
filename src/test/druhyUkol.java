package test;

public class druhyUkol {
    public static void main(String[] args) {
        int[] grades = {1,5,3,1,2,1,1};
        int counter =0;
        int avg= 0;
        for (int i = 0; i < grades.length; i++) {
            counter += grades[i];
            avg = counter/ grades.length;
            if (grades[i]> 2 && avg > 1.5){
                System.out.println("Nema vyznamenani");
            } else {
                System.out.println("Ma vyznameni");
            }

        }

        }
    }

