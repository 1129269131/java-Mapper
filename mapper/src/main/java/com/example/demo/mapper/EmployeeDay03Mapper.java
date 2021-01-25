package com.example.demo.mapper;

/* 31.创建自定义Mapper接口.avi */
import com.example.demo.entities.Employee;
import com.example.demo.mine_mapper.MyMapper;
import org.apache.ibatis.annotations.CacheNamespace;

@CacheNamespace
public interface EmployeeDay03Mapper extends MyMapper<Employee> {
}
