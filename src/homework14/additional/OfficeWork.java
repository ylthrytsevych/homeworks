package homework14.additional;
/*
Опис задачі: Створіть клас OfficeWork для представлення робітників в офісі та інтtрфейс Job.
Кожен робітник має виконувати різні види робіт (наприклад, програмування, дизайн, тестування).
Для представлення видів робіт використайте анонімні класи.
Класс OfficeWork повинен мати такі приватні параметри:
String name;
публічні методи:
doWork(Job job) - викликає метод perform
Інтерфейс Job повинен мати метод:
**perform();**
 */

public class OfficeWork {

    // Тут повинен бути ваш код
    public interface Job {
        void perform();
    }

    public static class Worker {
        String name;

        public Worker(String name) {
            this.name = name;
        }

        public void doWork(Job job) {
            job.perform();
        }
    }
}