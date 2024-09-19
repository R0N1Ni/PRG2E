package TestClass;

public class City {
    String name;
    Geolocation geolocation;

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nazev mesta " + name  + '(' + geolocation.x  + ',' + geolocation.y + ')' ;
    }
}
