package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND연산");

        System.out.println(true && true);   //true
        System.out.println(true && false);//false
        System.out.println(false && false);//false

        System.out.println("|| :OR연산");
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || false);//false

        System.out.println(!true);
        System.out.println(!false);

    }
}
