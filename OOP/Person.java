public class Person{
    // 속성 - 멤버 변수
    String name;
    int age;
    boolean isHungry;

    // 동작 - 멤버 메서드
    void eat(){
        System.out.println("냠");
        isHungry = false;
    }

    void work(){
        System.out.println("열심!");
        isHungry = true;
    }
}