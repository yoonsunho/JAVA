package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();//자신한테 없으면 부모로 올라가서 찾게됨
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.openDoor();
        hydrogenCar.fillHydrogen();
        hydrogenCar.move();
    }
}
