package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/10.
 */
public abstract class Shape {
    private double erea;
    private double per;
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPer();

    public abstract void showAll();
}

