package com.example.demo.services;

import com.example.demo.entities.Employee;
import com.example.demo.mapper.EmployeeDay03Mapper;
import com.example.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeDay03Mapper employeeDay03Mapper;

    public Employee getOne(Employee employeeQueryCondition){
        return employeeMapper.selectOne(employeeQueryCondition);
    }

    public List<Employee> getAll(){
        return employeeMapper.selectAll();
    }

    public Employee getEmployeeById(Integer empId){
        return employeeMapper.selectByPrimaryKey(empId);
    }

    public boolean isExists(Integer empId){
        return employeeMapper.existsWithPrimaryKey(empId);
    }

    public void saveEmployee(Employee employee){
        employeeMapper.insert(employee);
    }

    public void saveEmployeeSelective(Employee employee){
        employeeMapper.insertSelective(employee);
    }

    public void updateEmployeeSelective(Employee employee){
        employeeMapper.updateByPrimaryKeySelective(employee);
    }

    public void deleteEmployee(Employee employee){
        employeeMapper.delete(employee);
    }

    public void deleteEmployeeById(Integer empId){
        employeeMapper.deleteByPrimaryKey(empId);
    }

    public List<Employee> getEmpListByExample(Example example){
        return employeeMapper.selectByExample(example);
    }

    public List<Employee> mineMapperGetAll(){
        return employeeDay03Mapper.selectAll();
    }

    public void batchUpdate(List<Employee> empList){
        employeeDay03Mapper.batchUpdate(empList);
    }
}
