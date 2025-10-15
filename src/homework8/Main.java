package homework8;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Створіть масив цілих чисел з 15 елементами.
Заповніть масив випадковими цілими числами в діапазоні від 1 до 100.
Виведіть початковий вигляд масиву.

Відсортуйте масив за допомогою алгоритму сортування вставкою (Insertion Sort) в порядку зростання.
Виведіть відсортований масив.

Попросіть користувача ввести число для пошуку в масиві.
Використовуючи алгоритм бінарного пошуку, знайдіть і виведіть індекс введеного користувачем числа у відсортованому масиві або повідомте, якщо числа немає.
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
 */
public class Main
{
    public static void main(String[] args) {
        int[] array = new int[15];
        int len = array.length;
        Random random = new Random();

        int min = 1;
        int max = 100;
        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        System.out.println("Original Array is:");
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int key = array[i];

            //не працює, треба через while або хз як ще, лишаю на згадку
//            for(int j = i-1; j >= 0; j--) {
//                if (array[j] > key) {
//                    array[j+1] = array[j];
//                }
//                else{
//                    array[j+1] = key; //не спрацьовує з нульовим елементом, треба виносити  j за межі цикла
//                    break;
//                }
//            }

            int searchIndex = i - 1;
            while (searchIndex>=0 && array[searchIndex]>key){
                array[searchIndex+1] = array[searchIndex];
                searchIndex--;
            }
            array[searchIndex+1] = key;

        }
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Please enter element to search: ");
        Scanner scanner = new Scanner(System.in);
        int elToSearch = scanner.nextInt();

        int[] searchIndexes = new int[array.length]; //спробуємо записати якщо індексів буде кілька, раптом будуть дублікати, але що робити з іншими значеннями?
        for (int i = 0; i < searchIndexes.length; i++) {
            searchIndexes[i] = -1; //виставляю все в інше в ненульове значення щоб потім вивести правдиві індекси
        }
        int indexFounded = 0;
        for (int i = 0; i < array.length; i++) {
            if(elToSearch == array[i]){
                searchIndexes[indexFounded] = i;
                indexFounded++;
            }
        }
        if(indexFounded==0){
            System.out.println("Element "+elToSearch+" was not found in array");

        }
        else if (indexFounded==1){
            System.out.println("Element "+elToSearch+" was found in array at index "+searchIndexes[0]);
        }
        else{
            System.out.print("Element "+elToSearch+" was found in array at indexes: ");
            String res="";
            for (int val : searchIndexes) {
                if (val != -1) {
                    res+= val + ", ";
                }
            }
            res = res.substring(0, res.length() - 2);//видаляю останню кому і пробіл
            System.out.print(res);
        }
    }
}
