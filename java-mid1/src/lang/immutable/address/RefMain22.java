
package lang.immutable.address;

public class RefMain22 {

    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");        //xoo1
        ImmutableAddress b = a;  //참조값 대입을 막을 수 있는 방법은 없음 //x001

        System.out.println(a);
        System.out.println(b);

//        b.setValue("부산"); //setValue 없음
        b = new ImmutableAddress("부산"); //새롭게 인스턴스 생성해야 값 변경 가능


        System.out.println(a);//서울// 사이드 이팩트 발생
        System.out.println(b);//부산

    }
}
