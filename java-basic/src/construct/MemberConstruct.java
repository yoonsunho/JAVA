package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    
    // 생성자 class 이름과 같음 + 반환없음
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;


    }
}
