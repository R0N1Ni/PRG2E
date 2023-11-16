package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Krizovka {
    public static void main(String[] args) {
        //vygenerovat pole
        //v poli jsou random cisla 1-15
        //cisel bude 6
        //uzivatel ma 6 pokusu
        //za kazde uhadnuti +100 skore
        //na konci vypsat skore

        int [] toGuess = new int[6];
        int score = 0;
        Scanner sc = new Scanner(System.in);
        int guess;
        for (int i = 0; i < toGuess.length; i++) {
            toGuess[i] = (int)(Math.random()*15+1);
        }
        //cheat:
        System.out.println(Arrays.toString(toGuess));

        // 6x se ptame

        for (int i = 0; i < 6; i++) {
            System.out.println("Tipni cislo:");
            guess = sc.nextInt();

            //zadal neplatnou hodnotu
            if (!(guess >0 && guess <16)) {
                System.out.println("Ne");
                continue;
            }
            //prochazi pole
            for (int j = 0; j < toGuess.length; j++) {
                //kontroluje jestli uhodl
                if (toGuess[j] == guess){
                    System.out.println("Uhadl!");
                    score += 100;
                    toGuess[j] = -1;
                }
            }
            //ma jeste neco hadat?
            //toGuess.length * 100 = maximalni skore
            if (score == toGuess.length*100){
                break;
            }
            System.out.println(Arrays.toString(toGuess));
        }

        System.out.println("Game over, total score: " + score);
    }
}
