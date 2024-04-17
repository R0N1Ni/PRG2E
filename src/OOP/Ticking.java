package OOP;

public class Ticking {
    public static void main(String[] args) {
        Clock basic = new Clock(1,0,0,true,5,24,16);

        while (basic.hours <= 6){
            basic.tick();

//            basic.printTime();
        }
//        Clock dalsi = new Clock(16,30,0,true);
//        System.out.println("Casy: ");
//        dalsi.printTime();
//        basic.printTime();
//        System.out.println("Rozdil " + basic.difference(dalsi));

//        Clock fixed = new Clock(0,0,0,false);
//        fixed.hours = 10;



    }
}
