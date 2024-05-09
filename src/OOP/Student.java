package OOP;

public class Student {
    int ID;
    String name;
    static int counter;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
        counter++;
    }

    static public int getStudents() {
        return counter;
    }

    public void getDetails() {
        System.out.println(name);
        System.out.println(ID);
    }
}

