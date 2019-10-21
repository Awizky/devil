package com.xd;

import com.xd.bean.Emp;
import com.xd.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ClassUtils;

import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring_config.xml")
public class AppTest 
{
    @Autowired
    private EmpService es;

    @Test
    public void test()
    {
        List<Emp> emp = es.findAll();
        for (Emp emp1 : emp) {
            System.out.println(emp1);
        }
    }
    @Test
    public void test1()
    {
        String rootPath2 = ClassUtils.getDefaultClassLoader().getResource("").getPath();
        String root = Class.class.getClass().getResource("/").getPath();
        String str=root.substring(0,root.length()-20);

        String path = str+"src/main/webapp/upload/";
        System.out.println(str);
        System.out.println(path);
    }
}
