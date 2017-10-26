package com.company;

/**
 * Created by student1 on 26.10.17.
 */

public class Point {
    float x;
    float y;

    public Point(){}
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public static float distance(Point a, Point b){
        return (float)
                Math.abs(
                        Math.sqrt(
                                Math.pow((a.x-b.x), 2) + Math.pow((a.y - b.y), 2)
                        )
                );
    }
}
