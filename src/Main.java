import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        for (int a = 1; a <= 10; a++)
            System.out.println("Iteration of cycle " + a);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        for (int b = 10; b > 1; b--)
            System.out.println("Iteration of cycle " + b);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        for (int a = 2; a < 17; a = a + 2)
        System.out.println("Number " + a );
    }

    public static void task4 () {
        System.out.println("Задача 4");
        for (int a = 10; a >= -10; a--)
            System.out.println(a);

    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year = year + 4)
        System.out.println(year + " is a leap year.");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        for (int a = 7; a <= 98; a = a+7)
        System.out.println(a);

    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int a = 2; a <= 512; a = a*2)
            System.out.println(a);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int savings = 29000;
        int total = 0;
        for (int a = 1; a <= 12; a++) {
            total = savings + total;
            System.out.println("Month " + a + ", the sum of savings is " + total);
        }
    }
    public static void task9 () {
        System.out.println("Задача 9");
        int savings = 29000;
        double total = 0;
        for (int a = 1; a <= 12; a++) {
            total = total + total * 0.01;
            total = savings + total;
            System.out.println("Month " + a + ", the sum of savings is " + total);
        }
    }
    public static void task10 () {
        System.out.println("Задача 10");
        int result = 1;
        for (int b = 1; b <= 10; b++) {
            result = b*2;
        System.out.println("2*" + b + "=" + result);}
    }
}