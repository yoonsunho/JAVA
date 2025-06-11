package array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생수 ?");
        int num = scanner.nextInt();

        int [] students = new int [num];

        for (int student : students) {
            System.out.println(student);
        }

    }


}
