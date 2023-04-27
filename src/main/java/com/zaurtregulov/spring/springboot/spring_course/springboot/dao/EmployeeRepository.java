package com.zaurtregulov.spring.springboot.spring_course.springboot.dao;



import com.zaurtregulov.spring.springboot.spring_course.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
