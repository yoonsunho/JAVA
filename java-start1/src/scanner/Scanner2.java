package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번쨰 수를 입력:");
        int num1 = scanner.nextInt();


        System.out.println("듀번쨰 수를 입력:");
        int num2 = scanner.nextInt();

        int sum = num1+num2;
        System.out.println(sum);
    }
}
