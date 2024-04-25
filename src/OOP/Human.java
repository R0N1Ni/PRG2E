package OOP;

public class Human {

//    1. atributy
    String name;
    String surname;
    int age;
    int weight;
    int height;
    String sex;
    int lastDays;

//    2.konstruktor
    Human(String name, String surname, int age, int weight, int height, String sex,int lastDays ){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.lastDays = lastDays;
    }


//    3.metody
    String getFullName() {
        return name + " " + surname;
    }

    void printAgeGroup(){
        System.out.print("Ja jsem " + getFullName() + " a jsem ");

        if (age < 18){
            System.out.println("dite");
        } else {
            System.out.println("dospely");
        }
    }
    boolean canDonate(){
        return (weight >= 50 && weight <= 185 && age >= 18 && age <= 65) && (sex.equals("M") && lastDays>=90) || (sex.equals("F") && lastDays>=120);
    }

}
