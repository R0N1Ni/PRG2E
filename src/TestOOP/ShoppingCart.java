package TestOOP;

public class ShoppingCart {
    int totalPrice;
    int discount;

    public ShoppingCart(int discount) {
        this.discount = discount;
    }


    int add (int itemPrice){
        totalPrice += itemPrice;
        return totalPrice;
    }
    int remove (int itemPrice){
        if (totalPrice - itemPrice <= 0){
            System.out.println("nelze");
        } else {
            totalPrice -= itemPrice;
        }
        return totalPrice;
    }
    int getPrice(double DPH){
       return (int) ((totalPrice * (discount/100)) * 1.21);
    }
}
