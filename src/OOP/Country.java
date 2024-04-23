package OOP;

public class Country {
    private String name;
    private double area;
    private int population;
    private String CountryCode;

    public Country(String name, double area, int population, String countryCode) {
        this.name = name;
        this.area = area;
        this.population = population;
        CountryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountryCode() {
        return CountryCode;
    }


    public void setArea(double area) {
        if (area <= 0){
            return;
        }
        this.area = area;
    }

    public void setPopulation(int population) {
        if (population <= 0){
            return;
        }
        this.population = population;
    }

    public void setCountryCode(String countryCode) {
        if (countryCode.length() == 3 ){
            this.CountryCode = countryCode;
        } else {
            System.out.println("jses kokot");
        }



    }
}
