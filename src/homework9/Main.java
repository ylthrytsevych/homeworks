package homework9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Створіть Java програму, яка виконує наступні завдання, використовуючи двовимірний масив (матрицю):

Створіть двовимірний масив цілих чисел розмірністю 4x4.
Заповніть матрицю випадковими цілими числами в діапазоні від 1 до 50.
Виведіть матрицю на екран у вигляді таблиці.
Знайдіть суму всіх елементів в парних рядках (рядок 0, 2) та суму всіх елементів в непарних рядках (рядок 1, 3).
Знайдіть добуток всіх елементів в парних стовпцях (стовпцях 0, 2) та добуток всіх елементів в непарних стовпцях (стовпцях 1, 3).
Виведіть результати сум та добутків для парних і непарних рядків та стовпців.
Перевірте, чи матриця є магічним квадратом. Магічний квадрат - це квадратна матриця, в якій суми всіх рядків, стовпців та діагоналей рівні між собою.
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
 */
public class Main {
    public static void main(String[] args) {
        //lesson debug
//        int[][] array = {
//                {23, 45, 12, 37},
//                {50, 11, 42, 20},
//                {33, 27, 19, 48},
//                {8, 39, 6, 4}
//        };

        int[][] array = new int[4][4];
        int rowCount = array.length;
        int columnCount = array[0].length;

        Random random = new Random();
        int min = 1;
        int max = 50;

        System.out.println("Матриця 4x4:");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                array[i][j] = random.nextInt((max - min) + 1) + min;
                //дебаг тестування магічного квадрату - заповнення усього одиницями
                //array[i][j] = 1;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();


        /// -----------------завдання 1 і 2 (рядки)----------------------
        /// -----------------ПІДХІД з окремими циклами-------------------
        int sum1 = 0;
        boolean isFirst = true;
        System.out.print("Сума елементів у парних рядках (рядок ");
        for (int i = 0; i < rowCount; i++) {
            if (i % 2 == 0) {
                if (isFirst) isFirst = false;
                else System.out.print(", ");
                System.out.print(i);

                for (int j = 0; j < columnCount; j++) {
                    sum1 += array[i][j];
                }
            }
        }
        System.out.print("): " + sum1);
        System.out.println();

        int sum2 = 0;
        isFirst = true;
        System.out.print("Сума елементів у непарних  рядках (рядок ");
        for (int i = 0; i < rowCount; i++) {
            if (i % 2 != 0) {
                if (isFirst) isFirst = false;
                else System.out.print(", ");
                System.out.print(i);

                for (int j = 0; j < columnCount; j++) {
                    sum2 += array[i][j];
                }
            }
        }
        System.out.print("): " + sum2);
        System.out.println();

        /// -----------------завдання 3 і 4 (колонки)----------------------
        /// -----------------ПІДХІД з спільним циклом----------------------
        long evenColsMultiply = 1;
        long oddColsMultiply = 1;
        String evenIndexes = "";
        String oddIndexes = "";

        for (int j = 0; j < columnCount; j++) {
            if (j % 2 == 0) {
                if (evenIndexes.isEmpty()) {
                    evenIndexes += j;
                } else {
                    evenIndexes += ", " + j;
                }
                for (int i = 0; i < rowCount; i++) {
                    evenColsMultiply = evenColsMultiply * array[i][j];
                }
            } else {
                if (oddIndexes.isEmpty()) {
                    oddIndexes += j;
                } else {
                    oddIndexes += ", " + j;
                }
                for (int i = 0; i < rowCount; i++) {
                    oddColsMultiply *= array[i][j];
                }
            }
        }
        System.out.println("Добуток елементів у парних стовпцях (стовпець " + evenIndexes + "): " + evenColsMultiply);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець " + oddIndexes + "): " + oddColsMultiply);

        System.out.println();

        /// -------------------МАГІЧНИЙ КВАДРАТ-----------------------
        //Перевірте, чи матриця є магічним квадратом. Магічний квадрат - це квадратна матриця, в якій суми всіх рядків, стовпців та діагоналей рівні між собою.
        boolean isMagic = true;
        int[] rowsSums = new int[rowCount];
        int[] colSums = new int[columnCount];
        int[] diagSums = new int[2];

        for (int i = 0; i < rowCount; i++) {
            int sumRow = 0;
            for (int j = 0; j < columnCount; j++) {
                sumRow += array[i][j];
            }
            rowsSums[i] = sumRow;
            if (i > 0 && rowsSums[i] != rowsSums[i - 1]) {
                isMagic = false;
                break;
            }
        }

        if(isMagic){ //заходимо сюди лише якщо на рядках не зафейлились
            for (int j = 0; j < rowCount; j++) {
                int sumCol = 0;
                for (int i = 0; i < columnCount; i++) {
                    sumCol += array[i][j];
                }
                colSums[j] = sumCol;
                if (j > 0 && colSums[j] != colSums[j - 1]) {
                    isMagic = false;
                    break;
                }
            }
            if(!Arrays.equals(colSums, rowsSums)){
                isMagic = false;
            }
        }

        if(isMagic){ //заходимо сюди лише якщо на колонках не зафейлились
            int mainDiagSum = 0;
            int secDiagSum = 0;
            for (int i = 0, j=columnCount-1; i < rowCount; i++, j--) {
                mainDiagSum += array[i][i];
                secDiagSum += array[j][i];
            }
            if (mainDiagSum!=secDiagSum) {
                isMagic = false;
            }
            else{
                diagSums[0] = mainDiagSum;
                diagSums[1] = secDiagSum;
            }

            if (mainDiagSum != secDiagSum || secDiagSum != colSums[0] || mainDiagSum != rowsSums[0]) {
                isMagic = false;
            }
        }

        if(isMagic){
            System.out.println("Так, це той самий магічний квадрат :)");
        }
        else {
            System.out.println("Це був не магічний квадрат :(");
        }

    }


    // Метод для знаходження суми всіх елементів в багатовимірному масиві
    public static int calculateSum(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum+=anInt;
            }
        }
        return sum;
    }

    // Метод для знаходження максимального значення в багатовимірному масиві
    public static int findMaxValue(int[][] array) {
        boolean hasElements = true;
        int max = Integer.MIN_VALUE;
        if(array.length<=0){
            hasElements = false;
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                if(anInt>=max){
                    max = anInt;
                }
            }
        }
        return hasElements ? max : Integer.MIN_VALUE;
    }

    // Метод для знаходження кількості елементів в багатовимірному масиві, що дорівнюють заданому значенню
    public static int countOccurrences(int[][] array, int targetValue) {
        int count = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if(anInt == targetValue)
                    count++;
            }
        }
        return count;
    }

    // Допоміжний метод для розрахунку кількості елементів в багатовимірному масиві
    private static int countElements(int[][] array) {
        int count = 0;
        for (int[] row : array) {
            count += row.length;
        }
        return count;
    }

    // Метод для знаходження середнього арифметичного значень в багатовимірному масиві
    public static double calculateAverage(int[][] array) {
        int sum = calculateSum(array);
        int totalElements = countElements(array);
        double aver = (double) sum / totalElements;
        return (totalElements==0) ? 0 : aver;
    }

    /**
     * Метод для визначення, чи сума елементів всіх рядків дорівнює сумі елементів всіх стовпців,
     * шляхом явного обчислення обох значень.
     */
    // Метод для визначення чи сума елементів всіх рядків дорівнює сумі елементів всіх стовбців
    public static boolean isSumOfRowsEqualSumOfColumns(int[][] array) {
        // Перевірка №1: Масив не може бути null або не містити рядків.
        if (array == null || array.length == 0) {
            return false;
        }

        // Перевірка №2: Перевіряємо перший рядок. Він не може бути null
        // і, що найголовніше, не може бути порожнім (мати довжину 0).
        if (array[0] == null || array[0].length == 0) {
            return false;
        }

        // Беремо довжину першого рядка за еталон. Тепер ми знаємо, що вона > 0.
        int standardRowLength = array[0].length;

        // Перевірка №3: Перевіряємо, чи всі наступні рядки відповідають еталону.
        for (int i = 1; i < array.length; i++) {
            // Рядок не може бути null і повинен мати таку ж довжину.
            if (array[i] == null || array[i].length != standardRowLength) {
                return false;
            }
        }

        long totalRowSum = 0;
        int maxCols = 0;

        // Обчислюємо суму по рядках та шукаємо максимальну кількість стовпців.
        // NULL-рядок трактуємо як рядок довжини 0 (дає внесок 0).
        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            if (row != null) {
                maxCols = Math.max(maxCols, row.length);
                for (int v : row) {
                    totalRowSum += v;
                }
            }
            // якщо row == null -> нічого не додаємо, maxCols не змінюємо
        }

        // Обчислюємо суму по стовпцях, перебираючи j від 0 до maxCols-1.
        // Для коротших або null-рядків пропускаємо (важить як 0).
        long totalColSum = 0;
        for (int j = 0; j < maxCols; j++) {
            for (int i = 0; i < array.length; i++) {
                int[] row = array[i];
                if (row != null && j < row.length) {
                    totalColSum += row[j];
                }
            }
        }

        return totalRowSum == totalColSum;
    }

}
