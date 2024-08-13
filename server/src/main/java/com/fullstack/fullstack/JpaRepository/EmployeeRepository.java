package com.fullstack.fullstack.JpaRepository;

import com.fullstack.fullstack.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByName(String name);
    List<Employee> findBySalary(float Salary);
}
