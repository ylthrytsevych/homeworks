package homework7;

/*
Створіть Java програму, яка виконує наступні завдання:

Створіть масив цілих чисел з 20 елементами.
Заповніть масив випадковими цілими числами в діапазоні від -100 до 100.
Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
Знайдіть та виведіть кількість парних і непарних чисел в масиві.
Знайдіть найбільший та найменший елементи масиву та їхні індекси.
Знайдіть і виведіть середнє арифметичне чисел, розташованих після першого від'ємного числа у масиві (або повідомте, якщо від'ємних чисел немає).
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
 */

import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {
       int[] array = new int[20];
        //int [] array = new int[]{34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
//        int [] array = new int[]{1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,1,1,1,1}; //тест без мінусів

        int len = array.length;
        Random random = new Random();

        int min = -100;
        int max = 100;
        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        System.out.println("Resulted Array is:");
        System.out.println(Arrays.toString(array));

        int negativeSum=0;
        int oddCount=0;
        int evenCount=0;
        int minVal = array[0];
        int minValIndex=0;
        int maxVal = array[0];
        int maxValIndex=0;
        int firstNegativeIndex = -1;
        int sumAfterNeg=0;
        float meanResult = 0;

        int index=0;
        for (int i : array) {
            if(firstNegativeIndex>0){
                sumAfterNeg+=i;
            }
            if(i<0){
//                negativeSum-=i; // -- мінус на мінус же дає плюс, лол. Закоментую щоб не забути
                negativeSum+=i;
                if(firstNegativeIndex==-1)
                    firstNegativeIndex = index+1;//+1 бо наступне число беремо вже в рахунок
            }
            if(i%2==0){
                evenCount++;
            }
            if(i<=minVal){
                minVal = i;
                minValIndex = index;
            }
            if(i>=maxVal){
                maxVal = i;
                maxValIndex = index;
            }
            index++;
        }

        oddCount = len - evenCount;

        System.out.println("Sum of negative numbers: "+negativeSum);
        System.out.println("Count of even numbers: "+evenCount);
        System.out.println("Count of odd numbers: "+oddCount);
        System.out.println("Minimum element was: "+minVal+" at index "+minValIndex);
        System.out.println("Maximum element was: "+maxVal+" at index "+maxValIndex);
        if(firstNegativeIndex>0)
        {
//            meanResult = (float)(sumAfterNeg / (len - firstNegativeIndex)); // дає некоректний варіант, бо спочатку ділить інти
            meanResult = (float)sumAfterNeg / (float)(len - firstNegativeIndex); // дає некоректний варіант, бо спочатку ділить інти
            System.out.println("Arithmetic mean of all numbers after first negative number is: %.2f".formatted(meanResult));
        }
        else{
            System.out.println("No negative numbers were found in array");
        }

    }

    public static double calculateAverage(int[] array) {
        double even = 0.0f;
        int sum = 0;
        for(int val: array){
            sum+=val;
        }
        if(array.length>0){
        even = (double)sum/(double)array.length;}
        else even = 0;
        return even;
    }
}
