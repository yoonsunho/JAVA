package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String [] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        String joinStr ="";
        for (String string : splitStr) {
            joinStr += string + "-";
        }

        System.out.println(joinStr); //Apple-Banana-Orange-

        // join()
        String joinedStr = String.join("-","A","B","C");
        System.out.println(joinedStr);

        // 문자열 배열 연결
        String result = String.join("-",splitStr);
        System.out.println(result);
        
    }
}
