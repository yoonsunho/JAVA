package poly.car1;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("Model3Car.startengine");
    }

    @Override
    public void offEngine() {
        System.out.println("model3.offengind");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("model3.pressaccel");
    }
}
