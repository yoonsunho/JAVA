package cond.ex;

public class Ex2 {
    public static void main(String[] args) {
        int dolor = 10;

        if(dolor < 0){
            System.out.println("잘못된 금액");
        } else if (dolor == 0) {
            System.out.println("환전할 금액이 없습니다");
        }else {
            System.out.println("환전할 금액은 "+ dolor*1300);
        }
    }
}
