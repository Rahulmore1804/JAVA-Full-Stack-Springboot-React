package com.fullstack.fullstack.Services;
import java.util.List;

import com.fullstack.fullstack.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class ServicesImplement implements EmpServices{
 @Autowired
 private  EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmplist() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmpl(Integer empId) {
        return employeeRepository.findById(empId).orElse(null);
    }

    @Override
    public Employee addEmp(Employee emp) {
        return employeeRepository.save(emp);
    }
}
