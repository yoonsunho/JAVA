package construct;

public class MethodInitMain {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1",17,90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2",20,70);
        MemberInit[] members = {member1,member2};

        for (MemberInit s : members) {
            System.out.println(s.name+":"+s.age+":"+s.grade);
        }
    }



}
