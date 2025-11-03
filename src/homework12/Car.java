package homework12;

public class Car {

    private final String model;
    private String color;
    private final int year;
    private boolean isStarted = false;

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    protected  void start() {
        if (isStarted) {
            System.out.println("Автомобіль " + model + " вже заведено.");
            return;
        }
        System.out.println("\nПочинаємо процес запуску автомобіля " + model + "...");
        startElectricity();
        startCommand();
        startFuelSystem();
        this.isStarted = true;
        System.out.println("Автомобіль " + model + " успішно заведено!");
    }


    protected  void startElectricity() {
        System.out.println("...Запуск електрики...");
    }

    protected  void startCommand() {
        System.out.println("...Перевірка систем...");
    }

    protected  void startFuelSystem() {
        System.out.println("...Запуск паливної системи...");
    }
}