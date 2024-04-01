package OOP;

public class Human {

//    1. atributy
    String name;
    String surname;
    int age;

//    2.konstruktor
    Human(String name, String surname, int age ){
        this.name = name;
        this.surname = surname;
        this.age = age;
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

}
