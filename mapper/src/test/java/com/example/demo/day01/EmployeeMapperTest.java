package com.example.demo.day01;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeMapperTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSelectOne(){
        // 1.创建封装查询条件的实体类对象
        Employee employeeQueryCondition = new Employee(null, "bob", 5560.11, null);

        // 2.执行查询
        Employee employeeQueryResult = employeeService.getOne(employeeQueryCondition);

        // 3.打印
        System.out.println(employeeQueryResult);
    }

    @Test
    public void testSelectByPrimaryKey(){
        // 1.提供id值
        Integer empId = 3;

        // 2.执行根据主键进行的查询
        Employee employee = employeeService.getEmployeeById(empId);

        // 3.打印结果
        System.out.println(employee);
    }

    @Test
    public void testExistsWithPrimaryKey(){
        // 1.提供id值
        Integer empId = 3;

        // 2.执行根据主键进行的查询
        boolean exists = employeeService.isExists(empId);

        // 3.打印结果
        System.out.println(exists);

    }

    @Test
    public void testInsert(){
        // 1.创建实体类对象封装要保存到数据库的数据
        Employee employee = new Employee(null, "emp01", 1000.00, 23);

        // 2.执行插入操作
        employeeService.saveEmployee(employee);

        // 3.获取employee对象的主键字段值
        Integer empId = employee.getEmpId();
        System.out.println("empId = " + empId);
    }

    @Test
    public void testInsertSelective(){
        // 1.创建实体类对象封装要保存到数据库的数据
        Employee employee = new Employee(null, "emp02", 3000.00, 23);

        // 2.执行插入操作
        employeeService.saveEmployeeSelective(employee);
    }

    @Test
    public void testUpdateByPrimaryKeySelective(){
        // 1.创建用于测试的实体类
        Employee employee = new Employee(7, "empNewName", null, null);

        // 2.执行更新
        employeeService.updateEmployeeSelective(employee);
    }

    @Test
    public void testDelete(){
        // 1.声明实体类变量作为查询条件
        Employee employee = new Employee(7, "empNewName", null, null);

        // 2.执行删除
        employeeService.deleteEmployee(employee);
    }

    @Test
    public void testDeleteByPrimaryKey(){
        // 1.提供主键值
        Integer empId = 5;

        // 2.执行删除
        employeeService.deleteEmployeeById(empId);
    }

}
