package poly.car1;

public class K3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("k3.startengine");
    }

    @Override
    public void offEngine() {
        System.out.println("k3.offengind");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("k3.pressaccel");
    }
}
