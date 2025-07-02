package lang.string.builder;

public class SpringBuilderMain {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);//ABCD

        sb.insert(4,"Java");
        System.out.println(sb);

        sb.delete(4,8);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb); //DCBA

        //StringBuilder => String
        String string = sb.toString();
        System.out.println("string = "+ string);



    }
}
