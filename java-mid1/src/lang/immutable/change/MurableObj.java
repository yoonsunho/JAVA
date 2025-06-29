package lang.immutable.change;

public class MurableObj {

    private int value;

    public MurableObj(int value) {
        this.value = value;
    }

    public void add(int addValue){
        value = value + addValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
