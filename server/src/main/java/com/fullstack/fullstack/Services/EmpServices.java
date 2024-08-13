package com.fullstack.fullstack.Services;
import java.util.List;

import com.fullstack.fullstack.entities.Employee;

public interface EmpServices {
    public List<Employee> getEmplist();
    public Employee getEmpl(Integer empId);



    public Employee addEmp(Employee emp);

}
