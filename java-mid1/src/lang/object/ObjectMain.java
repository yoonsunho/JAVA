package lang.object;

public class ObjectMain {
    public static void main(String[] args) {

        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object클래스의 메서드
        String string = child.toString();
        System.out.println(string);   //lang.object.Child@4e50df2e 객체의 정보 반환
    }
}
