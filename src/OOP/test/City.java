package OOP.test;

public class City {
    private final int population;
    String cityName;
    Country name;

    public City(int population, String cityName, Country name) {
        this.population = population;
        this.cityName = cityName;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mesto " + cityName + " lezi v "+ name.name + " a " + population;
    }
}
