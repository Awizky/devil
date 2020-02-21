package com.xd.mapper;

import com.xd.bean.Emp;

import java.util.List;

/**
 * @author Devil
 * @create 2019-10-10-19:39
 */
public interface EmpMapper {
    List<Emp> findAll();
    boolean delete(int e);
    boolean add(Emp emp);
}
