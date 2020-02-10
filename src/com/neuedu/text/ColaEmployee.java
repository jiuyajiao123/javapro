package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/10.
 */
public abstract class ColaEmployee {
    private String name;
    private int month;

    public abstract double getSalary(int month);

    public ColaEmployee(String name, int month) {
        this.month = month;
        this.name = name;
    }
}
