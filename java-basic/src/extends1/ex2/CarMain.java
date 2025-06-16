package extends1.ex2;


public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();//자신한테 없으면 부모로 올라가서 찾게됨
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
