package com.xd.service;

import com.xd.bean.Emp;

import java.util.List;

/**
 * @author Devil
 * @create 2019-10-11-15:31
 */

public interface EmpService {
    List<Emp> findAll();
    boolean delete(int e);
    boolean add(Emp emp);
}
