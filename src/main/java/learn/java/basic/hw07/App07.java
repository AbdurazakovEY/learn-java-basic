package learn.java.basic.hw07;

import static java.lang.System.*;

public class App07 {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = sumOfPositiveElements(arr2d);
        out.println(sum);
        out.println();
        printSquareOfSymbols();
        zeroingDiagonalElements(arr2d);
        int max = findMax(arr2d);
        out.println(max);
        out.println();
        int sumOfElements = sumOfElementsTheSecondRow2dArray(arr2d);
        out.println(sumOfElements);

    }

    /**
     * 1. Реализовать метод sumOfPositiveElements(..),
     * принимающий в качестве аргумента целочисленный двумерный массив,
     * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
     */
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    /**
     * 2. Реализовать метод, который принимает в качестве аргумента int size
     * и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
     */
    public static void printSquareOfSymbols() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                out.print("* ");
            }
            out.println();
        }
        out.println();
    }

    /**
     * 3. Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
     * и обнуляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
     */
    public static void zeroingDiagonalElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][i] = 0;
                out.print(arr[i][j] + " ");
            }
            out.println();
        }
        out.println();
    }

    /**
     * 4. Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
     */
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] arrLine : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arrLine[j]) {
                    max = arrLine[j];
                }
            }
        }
        return max;
    }

    /**
    * 5. Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
    * если второй строки не существует, то в качестве результата необходимо вернуть -1
    */
    public static int sumOfElementsTheSecondRow2dArray(int[][] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < arr[1].length; i++) {
            sum += arr[1][i];
        }
        return sum;
    }
}
