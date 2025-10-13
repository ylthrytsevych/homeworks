package homework6;

/*
Є діапазон чисел від 1 до 6, включно. За допомогою циклу розрахуйте суму чисел наростаючим підсумком та загальну суму
чисел. Виведення окремого пункту переліку чисел має бути пронумероване. Виведення має такий вигляд:
1) Num is 1, sum is 1
2) Num is 2, sum is 3
3) Num is 3, sum is 6
4) Num is 4, sum is 10
5) Num is 5, sum is 15
6) Num is 6, sum is 21
------------------------
Sum of numbers is 21

 */
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=6; i++) //або <7
        {
            sum+=i;
            System.out.printf("%d) Num is %d, sum is %d\n",i,i,sum);
        }
        System.out.printf("------------------------\n" +
                "Sum of numbers is %d\n\n",sum);



        // ---- реалізація через while do
        sum = 0; //обнуляю значення
        int i = 1;
        while (i <= 6) {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, sum);
            i++;
        }
        System.out.printf("------------------------\n" +
                "Sum of numbers is %d\n\n",sum);



        // ---- реалізація через do while
        sum = 0;
        i = 1;
        do {
            sum += i;
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, sum);
            i++;
        } while (i <= 6);
        System.out.printf("------------------------\n" +
                "Sum of numbers is %d",sum);


    }
}
