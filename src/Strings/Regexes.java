package Strings;

public class Regexes {
    public static void main(String[] args) {
        String num = "5";

        String rcReg = "[0-9]{2,}[[0-1][5-6]][0-3][0-9]/[0-9]{4}";
        if (num.matches("[0-9][0-9]")){
            System.out.println("Jsou stejne");
        }
    }
}
