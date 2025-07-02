package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String resullt = "";
        for (int i = 0;i<100000;i++){
            resullt +="hi";
        }

        long endTime = System.currentTimeMillis();

        System.out.println(resullt);
        System.out.println(endTime-startTime+"ms");
    }
}
