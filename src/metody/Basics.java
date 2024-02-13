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

}
