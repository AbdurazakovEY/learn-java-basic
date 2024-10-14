package learn.java.basic.hw03;

import java.util.Random;

public class App03 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 30 + 1);
        int b = (int)(Math.random() * 30 + 1);
        int c = (int)(Math.random() * 30 + 1);
        boolean d = new Random().nextBoolean();
        System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
        System.out.println();

        greetings();
        System.out.println();

        checkSign(a, b, c);
        System.out.println();

        selectColor(c);
        System.out.println();

        compareNumbers(a, b);
        System.out.println();

        addOrSubtractAndPrint(a, c, d);
    }

    public static void greetings() {
        System.out.println("Реализация метода greetings()");
        int a = 0;
        do {
            System.out.println("Hello, World, from, Java");
            a++;
        } while (a != 4);
    }

    public static void checkSign(int a, int b, int c) {
        System.out.println("Реализация метода checkSign(..)");
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data) {
        System.out.println("Реализация метода selectColor()");
        if (data < 10) {
            System.out.println("Красный");
        } else if (data > 10 && data < 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        System.out.println("Реализация метода compareNumbers()");
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println("Реализация метода addOrSubtractAndPrint()");
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
