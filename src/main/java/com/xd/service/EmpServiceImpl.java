package com.xd.service;

import com.xd.bean.Emp;
import com.xd.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Devil
 * @create 2019-10-11-16:20
 */
@Service
@Transactional(isolation = Isolation.DEFAULT )
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpMapper em;

    @Override
    public List<Emp> findAll() {
        return em.findAll();
    }

    @Override
    public boolean delete(int e) {
        return em.delete(e);
    }

    @Override
    public boolean add(Emp emp) {
        return em.add(emp);
    }
}
