package casting;

public class Casting3 {
    public static void main(String[] args) {
        long miv = 2147483647;
        long mio = 2147483650L;
        int iv = 0;
        iv = (int)miv;
        System.out.println(iv);

        iv = (int)mio;
        System.out.println(iv);//전혀 다른 수 출력
    }
}
