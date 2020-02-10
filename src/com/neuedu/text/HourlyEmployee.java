package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/10.
 */
public class HourlyEmployee extends ColaEmployee {
    private int hour;
    private int hourSalary;

    public HourlyEmployee(String name, int hour, int hourSalary, int month) {
        super(name, month);
        this.hour = hour;
        this.hourSalary = hourSalary;
    }

    @Override
    public double getSalary(int month) {
        if (hour <= 600) {
            return hour * hourSalary;
        } else {
            return 160 * hourSalary + (hour - 160) * hourSalary * 1.5;
        }

    }
}
