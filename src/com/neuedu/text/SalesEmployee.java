package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/10.
 */
public class SalesEmployee extends ColaEmployee {
    private int sale;
    private double ticheng;

    public SalesEmployee(String name, int sale, double ticheng, int month) {
        super(name, month);
        this.sale = sale;
        this.ticheng = ticheng;
    }

    @Override
    public double getSalary(int month) {
        return ticheng * sale;
    }
}
