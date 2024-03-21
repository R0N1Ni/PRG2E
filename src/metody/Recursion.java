package metody;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(notRecursive(2,5));
        System.out.println(Recursive(2,5));
    }
    public static int notRecursive(int root, int power){
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= root;
        }
        return result;
    }
    public static int Recursive(int root, int power){
        if (power ==1){
            return root; //jednoduche reseni
        }
        return Recursive(root, power - 1) * root;
    }
    public static void Countdown (int n){
        System.out.println(n);
        if (n >1 ){
            Countdown(n);
        }
    }
}
