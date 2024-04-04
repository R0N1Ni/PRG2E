package OOP;

public class SongsPractice {
    public static void main(String[] args) {
        Song paintIt = new Song();
        paintIt.name = "Paint it, black";
        paintIt.releaseYear = 1996;
        paintIt.composer = "The Rolling stones";
        paintIt.rating = 9.3;
        paintIt.duration = 227;
        paintIt.printInfo();

        Song dream = new Song();
        dream.name = "Dream on";
        dream.composer = "Aerosmith";
        dream.printInfo();

    }
}
