package OOP.test;

public class Country {
     String name;
    private final int population;
    CountryLanguange languange;

    public Country(String name, int population, CountryLanguange languange) {
        this.name = name;
        this.population = population;
        this.languange = languange;
    }

    @Override
    public String toString() {
        return "Zeme "+ name + " ma jazyk " + languange.languageName + " a " + population +  " obyvatel ";
    }

}
