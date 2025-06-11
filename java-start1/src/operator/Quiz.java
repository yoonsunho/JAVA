package operator;

public class Quiz {
    public static void main(String[] args) {

        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum = val1 + val2 + val3;
        System.out.println(sum);
        double avg = sum / 3;
        System.out.println(avg);

        int score = 50;
        boolean result = 80 <= score && score <=100;
        System.out.println(result);
    }
}
