package extends1.overriding.ex3;

public class GasCar extends Car {

    public void fillUp(){
        System.out.println("기름을 주유합니다.");
    }

    @Override
    public void move()
    {

        System.out.println("전기차를 빠르게 이동합니다");
    }
}
