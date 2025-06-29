package lang.object.test;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100,200);
        Rectangle rectangle2 = new Rectangle(100,200);
        System.out.println(rectangle);
        System.out.println(rectangle2);
        System.out.println(rectangle == rectangle2);     // false
        System.out.println(rectangle.equals(rectangle2));   //true
    }
}
