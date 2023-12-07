package test;
import java.util.Random;
public class tretiUkol {
    public static void main(String[] args) {
        int[] pole = new int[20];
        int sum = 0;
        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int)(Math.random()*201-100);

            sum += pole[i];
        }
        if (sum >0){
            System.out.println(sum);
        }else {
            System.err.println(sum);
        }


    }
}
