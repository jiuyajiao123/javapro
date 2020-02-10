package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/10.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {

        return width * height;
    }

    @Override
    public double getPer() {
        return 2 * (height * width);
    }

    @Override
    public void showAll() {
        System.out.println("矩形面积" + getArea());
        System.out.println("矩形周长" + getPer());
        System.out.println("矩形颜色" + getColor());
    }

}
