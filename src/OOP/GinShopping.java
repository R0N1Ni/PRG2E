package OOP;

public class GinShopping {
    public static void main(String[] args) {
        GinShop ginShop = new GinShop(100,600000);
//        ginShop.balance = 6000;
//        ginShop.bottles = 10;
        ginShop.sell(5);
        ginShop.printBalance();
        ginShop.sell(10);
        ginShop.buy(10);
        ginShop.sell(7);
        ginShop.printBalance();
    }
}
