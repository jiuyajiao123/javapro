package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/10.
 */
public class ShapeText {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20, "绿色");
        rectangle.showAll();
        Circle circle = new Circle(10, "红色");
        circle.showAll();
    }
}
