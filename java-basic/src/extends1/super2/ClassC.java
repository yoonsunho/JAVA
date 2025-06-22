package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        // super();//기본생성자는 없음
        super(2,20);
        System.out.println("ClassC생성자");
    }
}
