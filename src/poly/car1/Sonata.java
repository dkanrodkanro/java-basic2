package poly.car1;

public class Sonata implements Car{
    @Override
    public void startEngine() {
        System.out.println("Sonata.startEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Sonata.pressAccelerator");
    }

    @Override
    public void offEngine() {
        System.out.println("Sonata.offEngine");
    }
}
