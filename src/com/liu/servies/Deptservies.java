package com.liu.servies;

import com.liu.dao.Deptdao;
import com.liu.dao.Ideptdao;
import com.liu.pojo.Dept;

import java.util.List;

/**
 * Created by 86183 on 2020/2/18.
 */
public class Deptservies implements Ideptservies {
    Ideptdao deptdao = new Deptdao();

    @Override
    public List<Dept> query() {
        return deptdao.query();
    }

    @Override
    public int add(Dept dept) {
        return deptdao.add(dept);
    }

    @Override
    public int updata(Dept dept) {
        return deptdao.updata(dept);
    }

    @Override
    public int del(int deptno) {
        return deptdao.del(deptno);
    }

    @Override
    public Dept queryone(int deptno) {
        return null;
    }
}
