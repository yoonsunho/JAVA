package casting;
// 명시적 형변환 (큰 범위 -> 작은 범위)
public class Casting2 {
    public static void main(String[] args) {
        double dv = 1.5;
        int iv = 0;

        //iv = dv; // 컴파일 오류 발생
        iv = (int)dv;   //형변환
        System.out.println(iv);//1(소수점 아래 버림)
        System.out.println(dv);

        System.out.println((int)10.7);//10
    }
}
