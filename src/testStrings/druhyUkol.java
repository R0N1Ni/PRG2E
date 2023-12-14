package testStrings;

public class druhyUkol {
    public static void main(String[] args) {
        String[] spanishPhrases = {" el camino ", " la Bomba" , " elephant", " lancelot "};
        for (int i = 0; i < spanishPhrases.length; i++) {
            if (spanishPhrases[i].contains(" el ") || (spanishPhrases[i].contains(" la "))){
                System.out.println(spanishPhrases[i]);
            }
        }
    }
}
