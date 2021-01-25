package com.example.demo.day04;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatchUpdateDay04MapperTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void myBatchUpdate(){

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "newName01", 111.11, 10));

        empList.add(new Employee(2, "newName02", 222.22, 20));

        empList.add(new Employee(3, "newName03", 333.33, 30));

        employeeService.batchUpdate(empList);
    }

}
