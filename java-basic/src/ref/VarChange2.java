package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();

        dataA.value = 10;
        Data dataB = dataA; //참조값(주소)만 복사

        System.out.println(dataA);
        System.out.println(dataB);

        dataA.value = 20;
        System.out.println(dataA.value); //20
        System.out.println(dataB.value); //20


        dataB.value = 30;
        System.out.println(dataA.value); //30
        System.out.println(dataB.value); //30

    }
}
