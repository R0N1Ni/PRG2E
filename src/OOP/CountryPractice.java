package OOP;

public class CountryPractice {
    public static void main(String[] args) {
        Country a = new Country("Australia",7741220.00,14564489,"AUS");
        Country c = new Country("Canada",5656135.00,89475614,"CAN");
        System.out.println("Vice obyvatel ma: ");
        if (a.getPopulation() > c.getPopulation()){
            System.out.println(a.getName());
        }else {
            System.out.println(c.getName());
        }
    }
}
