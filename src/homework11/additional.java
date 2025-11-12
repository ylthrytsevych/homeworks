package homework11;

import java.util.Objects;

public class additional {

}



class Student{
    /*
    Створити клас Student з перевантаженими конструкторами для ініціалізації параметрів name та age.
    Додати методи для отримання значень name та age (методи getName та getAge)
    Перший конструктор приймає name та age
    Другий конструктор приймає тільки name
    Третій конструктор приймає тільки age
    Четвертий конструктор без параметрів
     */
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this(name,0);
    }

    public Student(int age) {
        this(null,age);
    }

    public Student() {
        this(null,0);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student other = (Student) obj;

        if (this.age != other.age) {
            return false;
        }
        if (this.name == null) {
            return other.name == null;
        } else {
            return this.name.equals(other.name);
        }
    }


}