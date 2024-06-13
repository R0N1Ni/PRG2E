package TestClass;

public class TravelPlan {
    City start;
    City  destination;
    int pricePerUnit;
    Geolocation geolocation;

    double a = start.geolocation.x - geolocation.x;
    double b =  destination.geolocation.y - geolocation.y;
    double c = (a*a) + (b*b);


    public TravelPlan(City start, City destination, int pricePerUnit, Geolocation geolocation) {
        this.start = start;
        this.destination = destination;
        this.pricePerUnit = pricePerUnit;
        this.geolocation = geolocation;
    }

    void getPlan(){
        System.out.println("Cesta od mesta "+ start.toString() + " do " + destination.toString());
        System.out.println("Vzdalenost " + Math.sqrt(Math.pow((start.geolocation.x - geolocation.x),2) + Math.pow((destination.geolocation.y - geolocation.y),2)) );
        System.out.println("Celkova cena " + Math.sqrt(Math.pow((start.geolocation.x - geolocation.x),2) + Math.pow((destination.geolocation.y - geolocation.y),2)) * pricePerUnit);
    }
}
