package lang.string.method;

public class StringChangeMain {

    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("인덱스 7부터의 부분 문자열:" + str.substring(7));
        System.out.println("인덱스 7부터 12까지의 부분 문자열: "+ str.substring(7,12));

        System.out.println("문자열 결합: " + str.concat("!!!"));

        System.out.println("'Java'를 'world'로 대체:"+ str.replace("Java","World"));
        System.out.println("첫번쨰 'Java'를 'world'로 대체"+ str.replaceFirst("Java","World"));

    }
}
