package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("hello\n");
        System.out.print("world\n");

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열: "+ str);

        System.out.print("정수를 입력하세요:");
        int iv = scanner.nextInt();
        System.out.println("입력한 정수: "+iv);

        System.out.print("실수를 입력하세요:");
        double dv = scanner.nextDouble();
        System.out.println("입력한 정수: "+dv);

    }
}
