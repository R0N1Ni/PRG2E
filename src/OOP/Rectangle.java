package OOP;

public class Rectangle {
    int width, height;
    double getArea(){
        return width * height;
    }
    boolean isSquare(){
        if (width == height){
            return true;
        } else {
            return false;
        }
    }

}
