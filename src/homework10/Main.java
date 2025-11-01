package homework10;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Створіть Java програму з використанням методів, яка виконує наступні завдання:

Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
Напишіть метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок, який складається з букв цього рядка у зворотньому порядку.
Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
Напишіть метод, який приймає параметри: ціле число n і рядок text. Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Введіть ціле число: ");
        int num = scan.nextInt();
        System.out.printf("Квадрат числа %d дорівнює %d.\n",num, toSquare(num));
        System.out.println();

        System.out.print("2. Об'єм циліндра з радіусом ");
        double r = scan.nextDouble();
        scan.nextLine();
        System.out.print(" і висотою ");
        double h = scan.nextDouble();
        scan.nextLine();
        System.out.print(" дорівнює "+cylinderVol(r,h)+"\n");
        System.out.println();

        int[] array = new int[]{10,20,30,40,50};
        System.out.println("3. Масив чисел: "+Arrays.toString(array));
        System.out.printf("Сума всіх елементів масиву дорівнює %d.\n", calculateSum(array));
        System.out.println();

        System.out.print("4. Введіть рядок: ");
        String str = scan.nextLine();
        System.out.printf("Рядок в зворотньому порядку: %s.\n",reverto(str));
        System.out.println();

        System.out.print("5. Введіть a: ");
        int a = scan.nextInt();
        System.out.print("Введіть b: ");
        int b = scan.nextInt();
        System.out.printf("Результат %d^%d дорівнює %d.\n",a,b, myPow(a,b));
        System.out.println();

        System.out.print("6. Введіть ціле число: ");
        num = scan.nextInt();
        scan.nextLine(); //fix enter
        System.out.print("  Введіть текстовий рядок: ");
        str = scan.nextLine();
        showTextNTimes(num,str);

    }

    //Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
    public static int toSquare(int a){
        return a*a;
    }

    //Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
    public static double cylinderVol(double r, double h){
        //Об'єм цилiндра V = π ⋅ r 2 ⋅ h
        return Math.PI * Math.pow(r, 2) * h;
    }

    //Напишіть метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
    public static int calculateSum(int... numbers) {
        int sum = 0;
        if (numbers == null)
            return 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    //Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок, який складається з букв цього рядка у зворотньому порядку.
    public static String reverto(String s){
        String res="";
        char[] arr = s.toCharArray();
        for (int i = arr.length-1; i >= 0; i--) {
            res+= arr[i];
        }
        return res;
    }

    public static int myPow(int a, int b){
        int res=1;
        for(int i =0; i<b; i++){
            res *=a;
        }
        return res;
    }

    //Напишіть метод, який приймає параметри: ціле число n і рядок text. Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.
    public static void showTextNTimes(int n, String s)
    {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

}






/// --- додаткові завдання з розділу Заняття ---
class MethodsExample {

    // Метод для складання рядків із масиву рядків
    public static String concatenateStrings(String[] strings) {
        if (strings == null)
            return "";
        String resStr = "";
        for (String string : strings) {
            if (string != null)
                resStr += string;
        }
        return resStr;
    }


    // Метод для визначення, чи масив є квадратним
    public static boolean isSquareArray(int[][] array) {
        if (array == null || array.length == 0)
            return false;

        boolean result = true;
        int prevLen = array[0].length;
        for (int[] ints : array) {
            if (ints.length != prevLen) {
                return false;
            }
            prevLen = ints.length;
        }
        int colLen = prevLen;
        for (int j = 0; j < colLen; j++) {
            int currLen = 0;
            for (int i = 0; i < array.length; i++) {
                currLen++;
            }
            if (currLen != prevLen)
                return false;
            prevLen = currLen;
        }
        return result;

        /// варіант від gpt - простіший, бо це ж масив масивів, отже довжина це кількість рядків
//        // Крок 2: Визначаємо "еталон" - кількість рядків.
//        // Кількість стовпців має бути такою ж.
//        int numberOfRows = array.length;
//
//        // Крок 3: Перевіряємо кожен рядок.
//        for (int[] row : array) {
//            // Кожен рядок повинен існувати (не бути null)
//            // і його довжина повинна дорівнювати кількості рядків.
//            if (row == null || row.length != numberOfRows) {
//                return false;
//            }
//        }
    }


    /*
Написати перевантажені методи з назвою calculateSum, для обчислення суми, з різною кількістю та типом вхідних параметрів.
перший метод приймає 2 параметри з типом int другоий метод приймає 3 параметри з типом int. третій метод приймає 2
параметри з типом double четвертий метод приймає перший параметр з типом int, другий з типом double п’ятий метод приймає
необмежену кількість цілочисельних значень
     */
    // Метод для суми двох цілих чисел
    public static int calculateSum(int a, int b) {
        return a+b;
    }

    // Метод для суми трьох цілих чисел
    public static int calculateSum(int a, int b, int c) {
        return a+b+c;
    }

    // Метод для суми двох дійсних чисел
    public static double calculateSum(double a, double b) {
        return a+b;
    }

    // Метод для суми двох дійсних чисел
    public static double calculateSum(double a, int b) {
        return a+b;
    }

    // Метод для обчислення суми цілочисельних значень
    public static int calculateSum(int... numbers) {
        int sum = 0;
        if (numbers == null)
            return 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

