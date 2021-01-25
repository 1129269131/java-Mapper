package com.example.demo.day02;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ByExampleMapperTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSelectByExample(){
        // 目标：WHERE (emp_salary > ? AND emp_age < ?) OR (emp_salary < ? AND emp_age > ?)

        // 1.创建Example对象
        Example example = new Example(Employee.class);

        //******************************
        // i.设置排序信息
        example.orderBy("empSalary").asc().orderBy("empAge").desc();

        // ii.设置“去重”
        example.setDistinct(true);

        // iii.设置select字段
        example.selectProperties("empName","empSalary");

        //******************************

        // 2.通过Example对象创建Criteria对象
        Example.Criteria criteria01 = example.createCriteria();
        Example.Criteria criteria02 = example.createCriteria();

        // 3.在两个Criteria对象中分别设置查询条件
        // property参数：实体类的属性名
        // value参数：实体类的属性值
        criteria01.andGreaterThan("empSalary", 3000)
                .andLessThan("empAge", 25);
        criteria02.andLessThan("empSalary", 5000)
                .andGreaterThan("empAge", 30);

        // 4.使用OR关键词组装两个Criteria对象
        example.or(criteria02);

        // 5.执行查询
        List<Employee> empList = employeeService.getEmpListByExample(example);

        for (Employee employee : empList) {
            System.out.println(employee);
        }
    }

}
