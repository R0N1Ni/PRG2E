package OOP;

public class RectanglePractice {
    public static void main(String[] args) {
        Rectangle abcd = new Rectangle();
        abcd.width = 5;
        abcd.height = 5;
        System.out.println("Obsah: " + abcd.getArea());
        System.out.println("Je to ctverec? " + abcd.isSquare()+);
    }
}
