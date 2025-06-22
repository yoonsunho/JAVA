package extends1.overriding.ex3;

public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();//자신한테 없으면 부모로 올라가서 찾게됨

        GasCar gasCar = new GasCar();
        gasCar.move();

        }
}
