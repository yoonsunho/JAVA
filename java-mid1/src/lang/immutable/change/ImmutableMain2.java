package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); //리턴값을 안받으면 무용지물임
        
        System.out.println(obj1.getValue()); //10
    }
}
