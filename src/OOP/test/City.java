package OOP.test;

public class City {
    private final int population;
    String cityName;
    Country name;

    public City(int population, String cityName) {
        this.population = population;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Mesto " + cityName + " lezi v "+ name + " a " + population;
    }
}
