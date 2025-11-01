package homework11;

/*
Створіть Java програму з використанням класів та конструкторів, яка виконує наступні завдання:

Створіть клас Person, який представляє особу з такими характеристиками: ім'я, вік та професія.
Оголосіть поля для цих характеристик та створіть конструктор класу, який дозволяє встановити значення цих полів при створенні об'єкта класу Person.
Створіть об'єкти класу Person для трьох різних осіб, використовуючи конструктор класу Person. Виведіть інформацію про цих осіб на екран.
Додайте метод в клас Person, який дозволяє встановити нову професію для особи. Використайте цей метод для зміни професії одного з об'єктів Person, а потім виведіть оновлену інформацію про цю особу на екран.
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
 */
public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name +
                ", Вік: "+ age +
                ", Професія: " + profession;
    }

    public void changeProfession(String newProf){
        this.profession = newProf;
    }
}
