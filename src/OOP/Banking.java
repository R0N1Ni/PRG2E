package OOP;

public class Banking {
    public static void main(String[] args) {
        int[] array = new int[4];
        Human human1 = new Human("Honza", "Maly",14);
        System.out.println("Ahoj ja jsem " + human1.getFullName());
        Human human2 = new Human("Lukas", "Velky", 20);
        human1.printAgeGroup();
        human2.printAgeGroup();




        //        BankAccount acc1 = new BankAccount();
//        acc1.balance = 1000;
//        acc1.bid = 123456;
//        acc1.owner = "Milan";
//
//        acc1.insert( 1000);
//        System.out.println(acc1.balance);
//        acc1.withdrawl(500);
//        System.out.println(acc1.balance);
//        acc1.withdrawl(50000);
//
//        BankAccount acc2 = new BankAccount();
//        acc2.balance = 500;
//        System.out.println("ACC1: " + acc1.balance);
//        System.out.println("ACC2: " + acc2.balance);
//        acc1.transaction(800, acc2);
//        System.out.println("ACC1: " + acc1.balance);
//        System.out.println("ACC2: " + acc2.balance);
    }
}
