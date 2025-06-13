package static1;

public class Data3 {
    public String name;
    public static int count; //static(인스턴스 영역이 아닌 메서드 내에서 관리)

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
