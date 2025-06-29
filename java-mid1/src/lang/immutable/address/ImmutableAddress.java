package lang.immutable.address;

public class ImmutableAddress {
    private final String value; //final 없어도 바꿀 방법 없긴 함

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
