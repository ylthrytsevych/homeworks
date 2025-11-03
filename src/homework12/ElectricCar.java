package homework12;

public class ElectricCar extends Car{

        private int batteryLevel;

        public ElectricCar(String model, String color, int year, int batteryLevel) {
            super(model, color, year);
            this.batteryLevel = batteryLevel;
        }

        @Override
        protected void startCommand() {
            System.out.println("...Перевірка бортового комп'ютера та інвертора...");
        }

        @Override
        protected void startFuelSystem() {
            System.out.println("...Активація системи батареї з зарядом " + batteryLevel + " кВт*год...");
        }
}
