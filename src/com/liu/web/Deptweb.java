package com.liu.web;

import com.liu.dao.Deptdao;
import com.liu.pojo.Dept;
import com.liu.servies.Deptservies;
import com.liu.servies.Ideptservies;

import java.util.List;
import java.util.Scanner;

/**
 * Created by 86183 on 2020/2/18.
 */
public class Deptweb {
    Ideptservies deptservies = new Deptservies();

    public void showmian() {
        System.out.println("-------------------------");
        System.out.println("1--------------------查询");
        System.out.println("2--------------------添加");
        System.out.println("3--------------------修改");
        System.out.println("4--------------------删除");
        System.out.println("-------------------------");
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                query();
                break;
            case 2:
                add(scanner);
                break;
            case 3:
                updata(scanner);
                break;
            case 4:
                del(scanner);
                break;
            default:
                System.exit(0);
        }
    }

    public void query() {
        List<Dept> list = deptservies.query();
        for (Dept dept : list) {
            System.out.println(dept);
        }
    }

    public void add(Scanner scanner) {
        System.out.println("请输入要添加的部门编号");
        int deptno = scanner.nextInt();
        System.out.println("请输入要添加的部门名称");
        String dname = scanner.next();
        System.out.println("请输入要添加的部门地点");
        String loc = scanner.next();
        Dept dept = new Dept(deptno, dname, loc);
        deptservies.add(dept);
        query();

    }

    public void updata(Scanner scanner) {
        System.out.println("请输入要修改的部门编号");
        int deptno = scanner.nextInt();
        System.out.println("请输入要修改的部门名称");
        String dname = scanner.next();
        System.out.println("请输入要修改的部门地点");
        String loc = scanner.next();
        Dept dept = new Dept(deptno, dname, loc);
        deptservies.updata(dept);
        query();
    }

    public void del(Scanner scanner) {
        System.out.println("请输入要修改的部门编号");
        int deptno = scanner.nextInt();
        deptservies.del(deptno);
        query();
    }
}
