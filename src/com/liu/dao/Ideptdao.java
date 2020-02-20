package com.liu.dao;

import com.liu.pojo.Dept;

import java.util.List;

/**
 * Created by 86183 on 2020/2/18.
 */
public interface Ideptdao {
    List<Dept> query();

    int add(Dept dept);

    int updata(Dept dept);

    int del(int deptno);

    Dept queryone(int deptno);
}
