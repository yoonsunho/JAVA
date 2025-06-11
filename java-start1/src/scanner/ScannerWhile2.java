package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.println("정수를 입력하시오 , 0입력시 종료");
            int number = input.nextInt();
            if(number == 0){
                break;
            }
            sum += number;

        }
        System.out.println("sum:"+sum);

    }
}
