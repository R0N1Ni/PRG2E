package TestMetody;

public class Test {
    public static void main(String[] args) {

//        newerDate("11.9", "10.2 ");
      double cena = cenaPalet(11.0,5.0,1.0,1.0);
        System.out.println(cena);

    }

    public static void newerDate(String date, String otherDate) {
        int d1 = Integer.parseInt(date);
        int d2 = Integer.parseInt(otherDate);
        if (d1 > d2) {
            System.out.println(d1);
        } else {
            System.out.println(d2);
        }

    }

    public static int timeValues(String[] times) {
        String[] cas = times[0].split(":");
        int hodiny = Integer.parseInt(times[0])*60;
        int minuty = Integer.parseInt(times[1]);
        int celkem = 0;
        for (int i = 0; i < times.length; i++) {
            celkem = hodiny + minuty;
            hodiny += hodiny;
            minuty += minuty;
        }
        return celkem;


    }

    public static double cenaPalet(double pocet, double cena, double vyska, double sirka) {
        double sleva = 0.85;
        if (pocet < 10) {
            return (cena * (vyska * sirka) *pocet) ;
        } else {
            return (cena * (vyska * sirka) *pocet) * sleva;
        }
    }


}
