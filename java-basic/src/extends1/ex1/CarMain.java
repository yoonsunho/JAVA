package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.change();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.change();
    }
}
