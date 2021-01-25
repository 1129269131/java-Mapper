package com.example.demo.day05开启2级缓存;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class cacheNamespaceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void mineMapperGetAll(){

        List<Employee> empList = employeeService.mineMapperGetAll();
        for (Employee employee: empList) {
            System.out.println(employee);
        }

        empList = employeeService.mineMapperGetAll();
        for (Employee employee: empList) {
            System.out.println(employee);
        }

    }

}
