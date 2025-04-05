public class ConditionalStatement {
    public static void main(String[] args) {

        int month = 3;

        int day = switch(month){
            case 2-> 29;
            case 4,6,9,11->30;
            default -> {
                yield 31;
            }
        };
        System.out.println(day);
    }
}
