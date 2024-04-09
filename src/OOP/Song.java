package OOP;

public class Song {
    String name;
    int duration;
    String composer;
    double rating;
    int releaseYear;

    public Song(String name, int duration, String composer, double rating, int releaseYear) {
        this.name = name;
        this.duration = duration;
        this.composer = composer;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public void printInfo(){
        System.out.println("Song: " + name);
        System.out.println("Written by: " + composer);
        System.out.println("Released: " + releaseYear);
        System.out.println("Rated: " + rating);
    }
}
