package static2;

public class DecoData {
    private  int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        //static method 안에서는 static 에만 접근 가능
//        instanceValue++; // 인스턴스 변ㄴ수 접근 compile error
//        instanceMethod(); // 인스턴스 메서드 접근 compile error
        staticValue ++;
        staticMethod();
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall(){

        instanceValue++; // 인스턴스 변ㄴ수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue ++;
        staticMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue = "+ instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = "+ staticValue);
    }
}
