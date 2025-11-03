package homework12;

public class DieselCar extends Car{
    private boolean hasTurbo; // Власне поле

    public DieselCar(String model, String color, int year, boolean hasTurbo) {
        super(model, color, year);
        this.hasTurbo = hasTurbo;
    }

    private void preheatGlowPlugs() {
        System.out.println("Додатковий крок: Прогрів свічок розжарення...");
    }

    @Override
    protected void startCommand() {
        preheatGlowPlugs();
        System.out.println("...Перевірка дизельних систем...");
    }

    @Override
    protected void startFuelSystem() {
        System.out.println("...Подача дизельного палива під високим тиском...");
    }
}
