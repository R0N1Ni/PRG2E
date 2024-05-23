package OOP.Maze;

import java.util.Scanner;

public class Player {
    String nickname;

    public Player(String nickname) {
        this.nickname = nickname;
    }

    String readMove(){
        System.out.println("Vyber si smer");
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }
}
