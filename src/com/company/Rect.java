package com.company;

import com.sun.javafx.scene.paint.GradientUtils;

import java.awt.geom.Point2D;

/**
 * Created by student1 on 26.10.17.
 */
public class Rect {
    Point top;
    Point bottom;

    public Rect(){}
    public Rect(Point top, Point bottom){
        this.top = top;
        this.bottom = bottom;
    }

    boolean isSquare(){
        float deltax = top.x - bottom.x;
        float deltay = top.y - bottom.y;

        if (deltax == deltay){
            return true;
        }else{
            return false;
        }
    }

    boolean isInside(Point p){

        boolean boolx = p.x >= top.x && p.x <= bottom.x;
        boolean booly = p.y >= top.y && p.y <= bottom.y;

        if (boolx && booly){
            return true;
        }else{
            return false;
        }
    }

    static boolean isOverlaping(Rect r1, Rect r2){

        Point p = new Point();
        for (float y = r1.top.y; y <= r1.bottom.y; y++) {
            for (float x = r1.top.x; x <= r1.bottom.x; x++) {
                p.x = x;
                p.y = y;

                if (r2.isInside(p)){
                    return true;
                }
            }
        }

        return false;
    }
}