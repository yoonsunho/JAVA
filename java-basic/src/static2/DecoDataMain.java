package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("정적 호출");
        //static 메서드는 import를 통해 바로 호출 가능
        staticCall();

        System.out.println("인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        staticCall();

        //믈래스츷 통한 접근
        staticCall();
    }
}
