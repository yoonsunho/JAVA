package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 고유하지 않는다.
        int a = 10;
        int b = a; // a의 값 복사 후 b에 대입
        System.out.println(a);
        System.out.println(b);

        b = 20;
        System.out.println(a);//10
        System.out.println(b);//20
    }
}
