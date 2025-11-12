package homework13.additional;

public class Bicycle implements Transport {
    @Override
    public void start() {
        System.out.println("Starts like a bicycle");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerates like a bicycle");
    }

    @Override
    public void brake() {
        System.out.println("Brakes like a bicycle");
    }

    @Override
    public void stop() {
        System.out.println("Stops the engine like a bicycle");
    }
}
