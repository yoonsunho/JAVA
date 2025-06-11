package loop.ex;

public class Ex3 {
    public static void main(String[] args) {
        int endNum = 5;
        for(int i = 1;i<=endNum;i++ ){
            for(int j = 1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
