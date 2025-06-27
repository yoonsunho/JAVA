package poly.car1;

public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("newcar.start");
    }

    @Override
    public void offEngine() {
        System.out.println("newcar.off");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("newcar.pressaccel");
    }
}
