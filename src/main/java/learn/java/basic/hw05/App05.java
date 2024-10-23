package learn.java.basic.hw05;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class App05 {
    public static void main(String[] args) {
        int cnt = (int)(Math.random() * 5 + 1);

        int size = 10;
        int upperBound = 10;
        int[] arr = new int[size];
        Random random = new Random();
        IntStream.range(0, size)
                .forEach(index -> arr[index] = random.nextInt(upperBound));

        printsLine(cnt,"hello");
        arraySum(arr);

        int[] arr03 = new int[10];
        arrayFill(cnt, arr03);

        arrayIncrement(cnt, arr);
        arrayComparison(arr);
    }

    public static void printsLine(int cnt, String tx) {
        System.out.println("Задача 01");
        for (int i = 0; i < cnt; i++) {
            System.out.println(tx);
        }
        System.out.println();
    }

    public static void arraySum(int[] arr) {
        System.out.println("Задача 02");
        int sum = 0;
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] >= 5) {
                sum += arr[i];
            }
        }
        System.out.println("sum = " + sum);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void arrayFill(int cnt, int[] arr03) {
        System.out.println("Задача 03");
        for (int i = 0; i < arr03.length; i++) {
            arr03[i] = cnt;
        }
        System.out.println(Arrays.toString(arr03));
        System.out.println();
    }

    public static void arrayIncrement(int cnt, int[] arr) {
        System.out.println("Задача 04");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + cnt;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void arrayComparison(int[] arr) {
        System.out.println("Задача 05");
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumOne += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumTwo += arr[i];
        }
        if (sumOne > sumTwo) {
            System.out.println("Sum of the first half = " + sumOne);
        } else {
            System.out.println("Sum of the second half = " + sumTwo);
        }
        System.out.println(Arrays.toString(arr));
    }
}
