package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A",address);
        MemberV1 memberB = new MemberV1("회원B",address);

        //회원 A,회원 B의 처음 주소는 모두 서울
        System.out.println(memberA);
        System.out.println(memberB);

        // 회원 B의 주소를 부산으로 변경해야함
        memberB.getAddress().setValue("부산");
        System.out.println(memberA); //부산
        System.out.println(memberB); // 부산
    }
}
