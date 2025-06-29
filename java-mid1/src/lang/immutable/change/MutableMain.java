package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {

        MurableObj obj = new MurableObj(10);

        obj.add(20);
        //계산 이휴의 값은 사라짐
        System.out.println(obj.getValue());//30
    }
}
