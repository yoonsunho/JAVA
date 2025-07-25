package lang.immutable.address;

public class RefMain3 {

    public static void main(String[] args) {

        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;  //주소값 공유

        System.out.println(a);
        System.out.println(b);

//        b.setValue("부산");
        change(b,"부산");
        System.out.println(a);//부산// 사이드 이팩트 발생
        System.out.println(b);//부산

    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소 값을 변경합니다."+changeAddress);
        address.setValue(changeAddress);
    }

}
