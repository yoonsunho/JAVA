package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        //자식 변ㄴ수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = "+ child.value);

        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = "+ parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent parent1 = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = "+ parent1.value);//변수는 오버라이딩 안됨
        parent1.method(); //메서드는 오버라이딩 됨(인스턴스 내에 오버라이딩한 메서드가 있으면 그게 우선순위임)
    }
}
