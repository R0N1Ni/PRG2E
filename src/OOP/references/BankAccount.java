package OOP.references;

public class BankAccount {
    long bankID;
    double balance;
    Person owner;

    public BankAccount(long bankID, double balance, Person owner) {
        this.bankID = bankID;
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdraw (double amount){
        if (balance >= amount ){
            balance -= amount;
            return true;
        }
        else {
            System.out.println("Osoba " + owner.fullname + "nemuze vybrat");
            return false;
        }
    }
    public boolean transfer(double amount, BankAccount other){

        if (withdraw(amount)){
            other.deposit(amount);
            return true;

        } else {
            System.out.println("Chuda pico");
            return false;
        }
    }

    public static void main(String[] args) {
        Person max = new Person("Maxmilion","Plzen");
        Person karel = new Person("Karel","Praha");

        BankAccount account1 = new BankAccount(987465, 50000, max);
        BankAccount account2 = new BankAccount(123654, 15000, karel);

        account2.withdraw(5000);

        if (account2.transfer(15000, account1)){
            System.out.println("Uzivatel " + account2.owner.fullname + " poslal uzivatel " + account1.owner.fullname + "cash na ucet");
        }
    }
}
