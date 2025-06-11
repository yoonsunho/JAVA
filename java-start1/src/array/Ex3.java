package array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수의 개수?");
        int num = scanner.nextInt();

        int [] numbers = new int[num];
        int total = 0;

        System.out.println(num+"의 정수 입력 ㄱ");

        for (int number : numbers) {
            int n = scanner.nextInt();
            total += n;
        }

        System.out.println("합:"+total);
        System.out.println("평균:"+(double)total/num);

    }
}
