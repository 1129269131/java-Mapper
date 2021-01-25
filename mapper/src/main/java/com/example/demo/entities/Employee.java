package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "table_emp")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id/* 不加的话xxxByPrimaryKey()方法无法明确主键 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)/* 该注解返回自增的主键 */
    private Integer empId;

    private String empName;

    @Column(name = "emp_salary_apple")
    private Double empSalary;

    private Integer empAge;

    public Employee() {
    }

    public Employee(Integer empId, String empName, Double empSalary, Integer empAge) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empAge=" + empAge +
                '}';
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }
}
