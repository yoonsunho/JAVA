package method;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total= 0;
        while (true){
            System.out.println("------------------------");
            System.out.println("1.입금| 2.출금| 3. 잔액확인| 4.종료");
            System.out.println("------------------------");
            System.out.print("선택:");

            int choice = scanner.nextInt();
            int amount;

            switch (choice){
                case 1:

                    System.out.print("입금액을 입력하세요.");
                    amount = scanner.nextInt();
                    total = deposit(total,amount);
                    break;
                case 2:
                    System.out.println("출금액 입력하시오.");
                    amount = scanner.nextInt();
                    total = withdraw(total, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: "+ total);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다");
                    return;
            }

        }
    }

    public static int deposit(int t, int p){
        t += p;
        System.out.println(p+"원 입금했습니다. 현재 잔액: "+ t);
        return t;
    }

    public static int withdraw(int t, int p){
        if(p>t){
            System.out.println(p+"원을 출금하려 했으나 잔액 부족.");
            return t;
        }
        t -= p;
        System.out.println(p+"원을 출금하였습니다. 현재 잔액: "+t+"원.");
        return t;
    }


}
