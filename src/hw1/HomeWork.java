package hw1;

public class HomeWork {
    public static void main(String[] args) {
        int m = 12;
        byte k = 2;
        short p = 35;
        long o = 350L;
        float z = 36.22F;
        double x = 45.8888;
        char l = '\u5a34';
        boolean j = true;
        String word = "Hello World!!!";   // задание 2

        System.out.println(calculate(2, 5, 10, 7));

        System.out.println(sum10to20(10, 5));

        positiveOrNegative(-15);

        System.out.println( itPositive(3));

        hello("Олег");

        leapyear(2300);

    }
    public static float calculate(float a, float b, float c, float d) {
        return a * (b+(c/d));
    }

    public static boolean sum10to20(int e, int f) {
        int sum = e + f;
        return (sum >= 10 && sum <= 20);
    }

    public static void positiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    public static boolean itPositive(int quantity) {
        return quantity < 0;
    }

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void leapyear(int year) {
        int n = year % 4;
        int q = year % 100;
        int g = year % 400;
        if (n == 0 && g == 0) {
            System.out.println("Год високосный.");
        } else if (n > 0 || q == 0) {
            System.out.println("Год невисокосный.");
        } else {
            System.out.println("Год високосный.");
        }

    }
}