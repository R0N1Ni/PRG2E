package metody;

public class Basics {
    public static void main(String[] args) {
        printHello();
        printGreeting("Karel");
        printGreeting("Honza");
        sum(5, 8);
        multiplication(5,3);//spocita ale nic neudela, musi byt ulozen
        int multiplicationResult = multiplication(5,3);
        System.out.println(multiplicationResult);
    }

    public static void printHello() {
        System.out.println("Hello world");
    }

    public static void printGreeting(String name) {
        System.out.println("Ahoj " + name);
    }

    public static void sum(int a, int b) {
        System.out.println(a + " + " + b + " = ");
        System.out.println(a + b);
    }

    public static int multiplication(int a, int b) {
    int result = a * b;
    return result;
    }
    public static void printEven(int n ){
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }

    public static boolean isEven (int number){
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
