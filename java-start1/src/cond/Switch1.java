package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 4;
        int coupon = 0;
        if(grade ==1){
            coupon = 1000;
        }else if (grade==2){
            coupon = 2000;
        }else if(grade == 3){
            coupon=3000;
        }else{
            coupon = 500;
        }
        System.out.println(coupon);
    }
}
