package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/10.
 */
public class ColaEmployeeText {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("张三", 6000, 2);
        System.out.println(salariedEmployee.getSalary(2));
        SalesEmployee salesEmployee = new SalesEmployee("李四", 6000, 180, 2);
        System.out.println(salesEmployee.getSalary(2));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("王五", 180, 7000, 2);
        System.out.println(hourlyEmployee.getSalary(2));
    }
}
