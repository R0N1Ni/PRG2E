package OOP;

public class GinShop {
int bottles;
int pricePerBottle;
final int PRICE_PER_SELL= 500;
final int PRICE_PER_BUY = 230;
int balance;

    public GinShop(int bottles, int balance) {
        this.bottles = bottles;
        this.balance = balance;
    }

    void sell(int bottles){
        if (this.bottles > bottles ) {
            this.bottles -= bottles;
            balance += PRICE_PER_BUY * bottles;
            System.out.println("Prodej probehl uspesne");
        }else {
            System.out.println("Prodej neprobehl");
        }
    }
    void buy (int bottles){
        if (this.balance >= PRICE_PER_BUY * bottles){
            balance -= PRICE_PER_BUY * bottles;
            this.bottles += bottles;
        } else {
            System.out.println("Jses chuda pica");
        }
    }
    void printBalance (){
        System.out.println("Na sklade " + bottles + " lahvi");
        System.out.println("V pokladne " + balance );
    }
}
