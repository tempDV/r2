package com.company;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point p1 = new Point(1, 2); // Топ
        Point p2 = new Point(4, 5); // Боттом
        Point p0 = new Point(1, 2); // Точка для сравнения
        //Rect r1 = new Rect(p1, p2); // Оперируемый ректангл

        Rect r1 = new Rect(
                //         x  y
                new Point (0, 0), // Топ первого ректангла
                new Point (3, 2)  // Боттом первого ректангла
        );

        Rect r2 = new Rect(
                //         x  y
                new Point (0, 2), // Топ второго ректангла
                new Point (1, 3)  // Боттом второго ректангла
            );

        System.out.println("Distance: " +       Point.distance(p1, p2));
        System.out.println();
        System.out.println("Square?: " +        r1.isSquare());
        System.out.println("Inside?: " +        r1.isInside(p0));
        System.out.println("Overlapping?: " +   Rect.isOverlaping(r1, r2));

    }
}