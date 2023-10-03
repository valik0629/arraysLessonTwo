import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("Arrays lesson two");
        task1_1(); // через цикл for
        task1_2(); // через цикл for each
        task2();
        task3();
        task4();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1_1() {
        System.out.println("Task 1 - вариант первый");
        int[] arr = generateRandomArray();
        int monthlyExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            monthlyExpenses += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + monthlyExpenses + " рублей.");
    }

    public static void task1_2() {
        System.out.println("Task 1 - вариант второй");
        int monthlyExpenses2 = 0;
        int [] arr1 = generateRandomArray();
        for (int expenses : arr1) {
            monthlyExpenses2 += expenses;
        }
        System.out.println("Сумма трат за месяц составила " + monthlyExpenses2 + " рублей.");
    }

    public static void task2() {
        System.out.println("Task 2");
        int [] arr = generateRandomArray();
        int minExpenses = arr[0] ; // минимальные предположим равны первому дню затрат
        int maxExpenses = arr[0]; // максимальные затраты предположим равны первому дню затра
        for (int minExp : arr) {
            if(minExpenses > minExp) {
                minExpenses = minExp;
            }
        }
        for (int maxExp : arr) {
            if(maxExpenses < maxExp) {
                maxExpenses = maxExp;
            }
        }
        System.out.println("Минимальная сумма затрат составила " + minExpenses +  " рублей. Максимальная сумма затрат составила " + maxExpenses + " рублей.");
    }

    public static void task3() {
        System.out.println("Task 3");
        int [] arr = generateRandomArray();
        int monthlyExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            monthlyExpenses += arr[i];
        }
        float middleExpenses = monthlyExpenses / arr.length;
        System.out.println("Средняя трата за месяц составила " + middleExpenses + " рублей.");

    }

    public static void task4() {
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i -- ) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("\n");
    }






}