package homework13.additional;

public class Airplane implements Transport {
    @Override
    public void start() {
        System.out.println("Starts like an airplane");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerates like an airplane");
    }

    @Override
    public void brake() {
        System.out.println("Brakes like an airplane");
    }

    @Override
    public void stop() {
        System.out.println("Stops the engine like an airplane");
    }
}
