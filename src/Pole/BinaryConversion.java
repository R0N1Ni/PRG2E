package Pole;

public class BinaryConversion {
    public static void main(String[] args) {
        int[] binaries = {1,0,1,0,0,1,1,0};
        int result = 0;

        for (int i = 0; i < binaries.length; i++) {

            result += binaries[i] * Math.pow(2, binaries.length - i-1);

        }
        System.out.println(result);
    }
}
