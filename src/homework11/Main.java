package homework11;

/*
Створіть Java програму з використанням класів та конструкторів, яка виконує наступні завдання:

Створіть клас Person, який представляє особу з такими характеристиками: ім'я, вік та професія. Оголосіть поля для цих
характеристик та створіть конструктор класу, який дозволяє встановити значення цих полів при створенні об'єкта класу Person.

Створіть об'єкти класу Person для трьох різних осіб, використовуючи конструктор класу Person. Виведіть інформацію про цих осіб на екран.

Додайте метод в клас Person, який дозволяє встановити нову професію для особи. Використайте цей метод для зміни професії
одного з об'єктів Person, а потім виведіть оновлену інформацію про цю особу на екран.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println();

        Person pers4 = new Person("Alice", 28, "Архітектор");
        System.out.println(pers4);

        pers4.changeProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        System.out.println(pers4);

    }
}
