package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 100;

        while(i <= endNum){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
