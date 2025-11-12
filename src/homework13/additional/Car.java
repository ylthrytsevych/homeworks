package homework13.additional;

public class Car implements Transport {
    @Override
    public void start() {
        System.out.println("Starts like a car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerates like a car");
    }

    @Override
    public void brake() {
        System.out.println("Brakes like a car");
    }

    @Override
    public void stop() {
        System.out.println("Stops the engine like a car");
    }
}
