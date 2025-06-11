package array;

import scanner.Scanner1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int maxCount = 3;
        String [] names  = new String[maxCount];
        int [] prices  = new int[maxCount];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("1. 상품 등록| 2. 상품 목록| 3. 종료");

            System.out.println("메뉴를 선택하세여");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){
                if(productCount<maxCount){
                    System.out.println("상품이름:");
                    names[productCount] = scanner.nextLine();
                    System.out.println("상품 가격:");
                    prices[productCount] = scanner.nextInt();
                    scanner.nextLine();
                    productCount++;
                }else{
                    System.out.println("더이상 상품 등록 할 수 없음");
                    continue;
                }

            }else if(choice == 2){
                if(productCount == 0){
                    System.out.println("등록된 상품 없음");
                    continue;
                }
                for(int i = 0;i<productCount;i ++){
                    System.out.println(names[i]+":"+prices[i]);
                }
            }else if(choice ==3){
                System.out.println("프로그램ㄴ을 종료합니다");
                break;
            }

        }
    }
}
