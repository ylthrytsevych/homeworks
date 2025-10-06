package homework4;

/*
Сума продажів товару дорівнює добутку кількості (шт) та ціни. Ціна має грошовий формат, два знаки після десяткового роздільника.
Середньоденна сума продажів дорівнює результату від поділу загальної суми продажів на кількість днів проведення торгівлі.

(2) В проекті створіть пакет app , де створіть клас Main . (3) В класі Main реалізуйте функціонал розрахунку суми
продажів за певний період та середньоденної суми продажів. При реалізації функціоналу зверніть увагу на створення та
перевикористання певних змінних для відповідних даних товарів. Для округлення значень розрахункових сум можете скористатись
можливостями System.out.printf() .

(4) Виведення в консоль повинно мати такий вигляд:
Product No 1: smartphone,
total sales for 5 days is EUR 12153,41,
sales by day is EUR 2430,68.
Product No 2: laptop,
total sales for 7 days is EUR 10486,85,
sales by day is EUR 1498,12.

 */

public class Main {

    public static void main(String[] args) {
        int itemNr = 0;
        String productName = "smartphone";
        String currency = "EUR";
        int daysCount = 5;
        double totalSales = 12153.41;
        double salesPerDay = totalSales / daysCount;

        System.out.printf("Product No %d: %s," +
                        "\ntotal sales for %d days is %s %.2f," +
                        "\nsales by day is %s %.2f.\n",
                ++itemNr, productName, daysCount, currency, totalSales, currency, salesPerDay);

        productName = "laptop";
        daysCount = 7;
        totalSales = 10486.85;
        salesPerDay = totalSales / daysCount;

        System.out.printf("Product No %d: %s," +
                        "\ntotal sales for %d days is %s %.2f," +
                        "\nsales by day is %s %.2f.\n",
                ++itemNr, productName, daysCount, currency, totalSales, currency, salesPerDay);

    }
}