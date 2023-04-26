package com.zaurtregulov.spring.springboot.spring_course.springboot.dao;



import com.zaurtregulov.spring.springboot.spring_course.springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
