package learn.java.basic.hw07;

public class App07 {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int size = 3;

        sumOfPositiveElements(arr2d);
        printSquareOfSymbols(size);
        zeroingDiagonalElements(arr2d);
        findMax(arr2d);
        sumOfElementsTheSecondRow2dArray(arr2d);
    }

    /*
    1. Реализовать метод sumOfPositiveElements(..),
    принимающий в качестве аргумента целочисленный двумерный массив,
    метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
    */
    public static void sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                sum += arr[y][x];
            }
        }
        System.out.println(sum);
        System.out.println();
    }

    /*
    2. Реализовать метод, который принимает в качестве аргумента int size
    и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
    */
    public static void printSquareOfSymbols(int size) {
        char[][] map;
        map = new char[size][size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = '*';
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
    3. Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
    и обнуляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
    */
    public static void zeroingDiagonalElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][i] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
    4. Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
    */
    public static void findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j])
                {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println();
    }

    /*
    5. Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
    если второй строки не существует, то в качестве результата необходимо вернуть -1
    */
    public static void sumOfElementsTheSecondRow2dArray(int[][] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (true) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
