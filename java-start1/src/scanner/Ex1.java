package scanner;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg;
        while (true){
            int num = input.nextInt();
            if(num == -1){
                break;
            }
            sum += num;
            count ++;
        }
        avg = (double)sum / count;
        System.out.println(sum);
        System.out.println(avg);
    }
}
