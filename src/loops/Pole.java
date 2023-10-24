package loops;

public class Pole {
    public static void main(String[] args) {
        int [] pole = {45, 123, 45, 21, 24, 42};
        System.out.println(pole[4]);

        int [] dalsiPole = new int[100];
 //       dalsiPole[2] = 9;

        for (int i = 0; i < dalsiPole.length; i++) {
            dalsiPole[i] = (int) (Math.random()*1000+1);

        }

        System.out.println("Vypis pole: ");
        for (int i = 0; i < dalsiPole.length; i++) {
            System.out.println(dalsiPole[i]);


        }
    }
}
