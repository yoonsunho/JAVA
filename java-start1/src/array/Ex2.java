package array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int [] numbers = new int [5];
        for (int i = 0;i<numbers.length;i++){
            Scanner input = new Scanner(System.in);

            numbers[i] = input.nextInt();
        }
//        System.out.println();

        for (int number : numbers) {
            System.out.print(number+",");
        }
    }
}
