package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpaces = "     Java Programming   ";

        System.out.println("소문자로 변환: "+ strWithSpaces.toLowerCase());
        System.out.println("대분자로 변환: "+ strWithSpaces.toUpperCase());

        System.out.println("앞 뒤 공백 제거(trim): "+ strWithSpaces.trim()+";");
        System.out.println("앞 뒤 공백 제거(strip): "+ strWithSpaces.strip()+";"); // 조금더 넓은 범위
        System.out.println("앞 공백 제거(strip): "+ strWithSpaces.stripLeading()+";"); // 조금더 넓은 범위
        System.out.println("뒤 공백 제거(strip): "+ strWithSpaces.stripTrailing()+";"); // 조금더 넓은 범위

    }
}
