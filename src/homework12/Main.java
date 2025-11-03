package homework12;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Петренко Петро Петрович", "Розробник", "ivanov@example.com", "+380501234567", 30);

        System.out.println("ПІБ: " + employee1.getFullName());
        System.out.println("Посада: " + employee1.getPosition());
        System.out.println("Email: " + employee1.getEmail());
        System.out.println("Телефон: " + employee1.getPhone());
        System.out.println("Вік: " + employee1.getAge());
        System.out.println();
        employee1.setPosition("Старший розробник");
        System.out.println("Нова посада: " + employee1.getPosition());
        System.out.println(employee1);
        System.out.println();
        System.out.println("--------");
        System.out.println();

        Car simpleCar = new Car("Ford Focus", "Сірий", 2018);
        Car tesla = new ElectricCar("Tesla Model S", "Червоний", 2023, 53);
        Car tavron = new DieselCar("ZAZ Tavria", "Білий", 2001, true);


        simpleCar.start();
        System.out.println("--------");
        tesla.start();
        System.out.println("--------");
        tavron.start();
        System.out.println("\n--- Спроба завести автомобіль, що вже працює ---");
        tavron.start();
    }
}
