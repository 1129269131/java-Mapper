package com.example.demo.day06;

import com.example.demo.entities.Address;
import com.example.demo.entities.Employee;
import com.example.demo.entities.SeasonEnum;
import com.example.demo.entities.User;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeHandlerDay06Test {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private UserService userService;

    @Test
    public void mineMapperGetAll(){
        List<Employee> empList = employeeService.mineMapperGetAll();
        for (Employee employee: empList) {
            System.out.println(employee);
        }
    }

    @Test
    public void testQueryUser() {
        Integer userId = 1;

        User user = userService.getUserById(userId);

        System.out.println(user);
    }

    @Test
    public void testSaveUser() {
        User user = new User(null, "tom08", new Address("AAA", "BBB", "CCC"), SeasonEnum.AUTUMN);

        userService.saveUser(user);
    }

}
