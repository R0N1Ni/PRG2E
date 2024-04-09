package OOP;

public class Dates {
    int day, month, year;

    Dates(int day, int month, int year ) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void printDDMM(){
        System.out.println(day + "." + month + ".");
    }

    void printDDMMYY(){
        System.out.println(day + "." + month + "." + year);
    }
    boolean isLeapYear(){
        return year % 4 == 0 && year % 100 != 0;
    }
}
