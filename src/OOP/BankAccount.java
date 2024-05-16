package OOP;

public class BankAccount {
    long bid = 12346589451654L;
    double balance;
    String owner;

    void insert(int amount){
        balance += amount;
    }
    void withdrawl(int amount){
        if (balance < amount){
            System.out.println("Chuda kundo");
        }else {
            balance -= amount;
        }
    }

    void transaction(int amount, BankAccount reciever){
        if (balance > amount){
            balance -= amount;
            reciever.balance += amount;
        } else {
            System.out.println("Prevod se nezdaril, jses chuda kunda");
        }

    }
}
