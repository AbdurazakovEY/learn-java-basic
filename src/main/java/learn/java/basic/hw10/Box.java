package learn.java.basic.hw10;

import java.util.Scanner;

public class Box {
    private int width;
    private int height;
    private int depth;
    private String color;
    private String item;
    private boolean isOpened;

    public Box (int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
    }

    public Box(String item) {
        this.item = item;
    }

    public Box(boolean isOpened) {
        this.isOpened = isOpened;
    }

    public void open() {
        if (item == null) {
            System.out.println("Коробка открыта");
        }
    }

    public void close() {
        if (item != null) {
            System.out.println("Коробка закрыта");
        }
    }

    public void repaint() {
        Scanner input = new Scanner(System.in);
        System.out.print("Пожалуйста, введите цвет: ");
        color = input.nextLine();
        System.out.println("Цвет: " + color);
    }

    public void printInfo(){
        System.out.print("Width: " + width + ", Height: " + height + ", Depth: " + depth + ", Color: " + color);
    }
}
