package cond.ex;

public class Ex1 {
    public static void main(String[] args) {
        //학점 계싼
        int score = 55;
        char grade;
        if(score >= 90){
            grade ='A';
        }else if (score >= 80){
            grade = 'B';
        }else if (score >= 70){
            grade ='C';
        } else if (score >= 60) {
            grade='D';
        }else {
            grade = 'F';
        }
        System.out.println(grade);

    }
}
