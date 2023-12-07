package Strings;

public class Priklady {
    public static void main(String[] args) {
        //1. cviceni
        String[] users = {"Long", "Filip", "Vitek"};
        String username = "Filip";
        boolean jeTam = false;



        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(username)){
                jeTam = true;
                break;
            }
        }

        if (jeTam == true) {
            System.out.println("Nachazi se tam");
        } else {
            System.out.println("neni tam");
        }

        //2. cviceni
        String text = "helo";
        boolean zdvoj = false;
        for (int i = 0; i < text.length()-1; i++) {
            System.out.println("i: " + i + " - cmp " + text.charAt(i) + " " + text.charAt(i+1) );
            if (text.charAt(i) == text.charAt(i+1)){
                zdvoj = true;
                System.out.println("Ano");
                break;
            }
        }
        if (zdvoj == false) {
            System.out.println("Ne");
        }
    }
}
