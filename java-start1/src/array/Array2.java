package array;

public class Array2 {
    public static void main(String[] args) {
//        int [] students = new int[]{90,80,70,50,60}; //배열 생성과 초기화
        //한줄일 대만 가능
        int [] students = {90,80,70,50,60}; //배열 생성과 초기화

//        System.out.println(students);
//        // 변수 값 대입
//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;

       for(int i = 0;i<students.length;i++){
           System.out.println("학생"+ (i+1)+"의 점수 : "+ students[i]);
       }


    }
}
