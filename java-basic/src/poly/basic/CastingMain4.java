package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;

        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent();
        //Child child2 = (Child)parent2;//parent로 생성해서 child자체를 사용할 수 없음.
        //child2.childMethod();

    }
}
