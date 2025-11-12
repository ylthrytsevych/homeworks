package homework15;

public class App {

    public static void main(String[] args) {

        System.out.println("Порадник для дітей:");
        Advisor chAdv = new ChildAdvisor();
        System.out.println(chAdv.advise(Day.MONDAY));
        System.out.println(chAdv.advise(Day.TUESDAY));
        System.out.println(chAdv.advise(Day.WEDNESDAY));
        System.out.println(chAdv.advise(Day.THURSDAY));
        System.out.println(chAdv.advise(Day.FRIDAY));
        System.out.println(chAdv.advise(Day.SATURDAY));
        System.out.println(chAdv.advise(Day.SUNDAY));

        System.out.println("-----------");
        System.out.println("Порадник для дорослих:");
        Advisor adAdv = new AdultAdvisor();
        System.out.println(adAdv.advise(Day.MONDAY));
        System.out.println(adAdv.advise(Day.TUESDAY));
        System.out.println(adAdv.advise(Day.WEDNESDAY));
        System.out.println(adAdv.advise(Day.THURSDAY));
        System.out.println(adAdv.advise(Day.FRIDAY));
        System.out.println(adAdv.advise(Day.SATURDAY));
        System.out.println(adAdv.advise(Day.SUNDAY));

        System.out.println("-----------");
        System.out.println("Порадник для старших людей:");
        Advisor oldAdv = new OldAdvisor();
        System.out.println(oldAdv.advise(Day.MONDAY));
        System.out.println(oldAdv.advise(Day.TUESDAY));
        System.out.println(oldAdv.advise(Day.WEDNESDAY));
        System.out.println(oldAdv.advise(Day.THURSDAY));
        System.out.println(oldAdv.advise(Day.FRIDAY));
        System.out.println(oldAdv.advise(Day.SATURDAY));
        System.out.println(oldAdv.advise(Day.SUNDAY));

    }
}
