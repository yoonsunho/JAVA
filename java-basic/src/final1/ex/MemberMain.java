package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId","kim");
        member.print();

        member.changeData("id2","seo");
        member.print();

    }
}
