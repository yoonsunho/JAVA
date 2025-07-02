package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<100000;i++){
            sb.append("hi");
        }

        long endTime = System.currentTimeMillis();

        System.out.println(sb);
        System.out.println(endTime-startTime+"ms"); //6ms
    }
}
