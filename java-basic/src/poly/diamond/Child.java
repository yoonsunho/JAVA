package poly.diamond;

public class Child implements InterfaceB,InterfaceA{
    @Override
    public void methodA() {
        System.out.println("methnodA");
    }

    @Override
    public void methodB() {
        System.out.println("methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
