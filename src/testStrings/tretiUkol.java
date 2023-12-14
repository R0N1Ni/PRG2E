package testStrings;

public class tretiUkol {
    public static void main(String[] args) {
        String text = "***";
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '*'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
