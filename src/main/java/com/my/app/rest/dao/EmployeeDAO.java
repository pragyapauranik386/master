package com.my.app.rest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.my.app.rest.model.Employee;
import com.my.app.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
    public void updateEmployee(Integer id,Employee employee) {
         list.updateEmployee(employee, id);
        
    }
    public void deleteEmployee(Integer id) {
          list.deleteEmployee(id);
    }
}
