package learn.java.basic.hw10;

import java.util.Scanner;

import static java.lang.System.*;

public class Box {
    private int width;
    private int height;
    private int depth;
    private String color;
    private String item;

    public Box (int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
    }

    public Box(String item) {
        this.item = item;
    }

    public void open() {
        if (item == null) {
            out.println("Коробка открыта");
        }
    }

    public void close() {
        if (item != null) {
            out.println("Коробка закрыта");
        }
    }

    public void repaint() {
        Scanner input = new Scanner(in);
        out.print("Пожалуйста, введите цвет: ");
        color = input.nextLine();
        out.println("Цвет: " + color);
    }

    public void printInfo(){
        out.print("Width: " + width + ", Height: " + height + ", Depth: " + depth + ", Color: " + color);
    }
}
