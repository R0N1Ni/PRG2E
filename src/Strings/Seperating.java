package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Seperating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Uzivatel zada nazev pisnicky, autora a rok vydani
        // Vse ulozime do jednotlivych retezcu
        String input = "Dream on;Aerosmith;(1973)";
        String songName;
        String author;
        String yearOfRelease;
        // ukazka - split
        String [] splitSong = input.split(";");
        System.out.println(Arrays.toString(splitSong));
        songName = splitSong[0];
        author = splitSong[1];
        yearOfRelease = splitSong[2];
        System.out.println("Song " + songName + " By author " + author + " Was released in " + yearOfRelease);
        String greetings = "Hello beautiful world";
        String [] words = greetings.split(" ");
        System.out.println(Arrays.toString(words));

        // Ukazka substringu
        String word = "Hello";
        String subWord = word.substring(0,4);
        //Interval: vsechny znaky na indexu <0, 4)
        System.out.println(word + "->" + subWord);

        //Vezmi string ve kterym je cislo a pricti k nemu 42
        String number = "450";
        System.out.println(number + 42);
        int actualNumber = Integer.parseInt(number);
        System.out.println("number is: " + actualNumber);
        System.out.println("Soucet je: " + (actualNumber + 42));
    }
}
