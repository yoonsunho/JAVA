package ref;

public class MethodChange2 {
    public static void main(String[] args) {

        Data dataA = new Data();

        dataA.value = 10;

        System.out.println(dataA.value); //10
        changeReference(dataA);
        System.out.println(dataA.value); //20
    }

    static void changeReference(Data dataX){
        dataX.value = 20;
    }

}
