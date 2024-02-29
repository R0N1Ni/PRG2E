package metody;

public class Practice {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(randomNumber(-24,24));
        }
        int[] array = randomArray(1,100,20);
        System.out.println();
    }

    public static int randomNumber(int min, int max){
        int cislo;
        cislo = (int)(Math.random()*(max - min + 1) + min);
        return cislo;
    }

    public static int[] randomArray(int min, int max, int length){
        int [] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber(min, max);
        }
        return array;
    }

}
