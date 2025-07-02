package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //xoo1
        String str2 = new String("hello");//x002

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true

        String str3 = "hello";//xoo3
        String str4 = "hello";//xoo3 //문자열 풀에 이미 있는 값이면 그걸 참조하게됨
        System.out.println(str3 ==str4);//true
        System.out.println(str3.equals(str4));//true
    }
}
