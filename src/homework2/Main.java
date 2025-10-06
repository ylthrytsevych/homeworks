package homework2;

/*
Магазин здійснює онлайн торгівлю.

(1) Створіть окремий проект.

(2) В проекті створіть пакет app , де створіть клас Main .

(3) В класі Main реалізуйте функціонал формування замовлень. При реалізації функціоналу зверніть увагу на створення та перевикористання певних змінних для відповідних даних замовлення.

(4) Виведення в консоль повинно мати такий вигляд:
Order No 1 Client: Alice.
Product: smartphone,
price EUR 305.99.
Address: Moon Street, 10.
Order No 2 Client: Tom.
Product: laptop,
price EUR 570.95.
Address: Terra Street, 17.

 */

public class Main {
    public static void main(String[] args) {
        int orderId = 1;                //int бо замовлень може бути доволі багато, якщо звісно треба було б більше - використав би long
        String clientName = "Alice";
        String product = "smartphone";
        float productPrice = 305.99f;
        String currency = "EUR";
        String street = "Moon Street";
        byte building = 10;             //припустимо що на кожній вулиці може бути максимум 127 будинків, інакше використав би short

        System.out.println("Order No " + orderId + " Client: " + clientName + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price " + currency + " " + productPrice + ".");
        System.out.println("Address: " + street + ", " + building + ".");

        orderId = 2;
        clientName = "Tom";
        product = "laptop";
        productPrice = 570.95f;
        street = "Terra Street";
        building = 17;

        System.out.println("Order No " + orderId + " Client: " + clientName + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price " + currency + " " + productPrice + ".");
        System.out.println("Address: " + street + ", " + building + ".");
    }
}
