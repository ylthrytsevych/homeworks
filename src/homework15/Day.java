package homework15;

public enum Day {
    MONDAY (1,"Понеділок"),
    TUESDAY(2, "Вівторок"),
    WEDNESDAY(3,"Середа"),
    THURSDAY(4,"Четвер"),
    FRIDAY(5,"П'ятниця"),
    SATURDAY(6, "Субота"),
    SUNDAY (7, "Неділя");

    private final int numberOfDay;
    private final String nameOfDay;

    Day(int num, String name){
        this.numberOfDay = num;
        this.nameOfDay = name;
    }

    public int getDayNumber() {
        return numberOfDay;
    }

    public String getName() {
        return nameOfDay;
    }

}
