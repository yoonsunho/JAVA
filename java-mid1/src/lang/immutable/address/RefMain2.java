package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {

        //서로 다른 참조(객체 공유x)
        Address a = new Address("서울");//x001
        Address b = new Address("서울");//x002

        System.out.println(a);
        System.out.println(b);

        b.setValue("부산");


        System.out.println(a);//서울// 사이드 이팩트 발생
        System.out.println(b);//부산

    }
}
