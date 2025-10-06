package homework5;

import java.util.Scanner;

/*
Доходи оподатковуются за прогресивною шкалою оподаткування:

від 0 до 10000, включно, за ставкою 2,5%.
від 10000, виключно, до 25000, включно, за ставкою 4,3%.
більше 25000, за ставкою 6,7%.
Необхідно розрахувати суму податку від певної суми доходу. Сума податку дорівнює відсотку від суми доходу.

 */

public class Main {
    static int income;
    static double taxRate;
    static double taxValue;
    static String message;
    static final String curr = "UAH";

    public static void main(String[] args) {

        System.out.printf("Please, enter your income:");
        Scanner input = new Scanner(System.in);
        income = input.nextInt();

        message = "Your tax rate is %.1f%%.\nYou need to pay %.2f %s of taxes.";

        if (income > 0 && income <= 10000) {
            taxRate = 2.5;
        } else if (income > 10000 && income <= 25000) {
            taxRate = 4.3;
        } else if (income > 25000) {
            taxRate = 6.7;
        } else {
            message = "You have entered wrong value";
            taxRate = 0;
        }

        taxValue = income * taxRate / 100;
        System.out.printf(message, taxRate, taxValue, curr);

    }
}
