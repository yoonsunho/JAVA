package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //xoo1
        String str2 = new String("hello");//x002

        System.out.println(isSame(str1,str2)); //true

        String str3 = "hello";//xoo3
        String str4 = "hello";//xoo3 //문자열 풀에 이미 있는 값이면 그걸 참조하게됨

        System.out.println(isSame(str3, str4)); //true
    }

    private static boolean isSame(String x, String y){
//        return x == y;
        return x.equals(y); // 문자열 비교는 항상 이렇게 빋교해줘야함
    }
}
