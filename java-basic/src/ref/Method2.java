package ref;

//import class1.Student;

public class Method2 {
    public static void main(String[] args) {

        Student student1 = createStudent("하생1",20,18);
        

    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student(); // 인스턴스 생성
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
}
