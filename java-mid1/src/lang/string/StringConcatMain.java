package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;

        System.out.println(result1); //hello java
        System.out.println(result2); //hello java
    }
}
