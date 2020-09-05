package com.my.app.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Employees 
{
    private List<Employee> employeeList;
    
    public List<Employee> getEmployeeList() {
        if(employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }
 
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public Employee findEmployeeByID(Integer id) {
    	Employee emp1 = new Employee();
        if(employeeList == null) {
            employeeList = new ArrayList<>();
        }
        for(Employee emp:employeeList) {
	        if(emp.getId().equals(id)) {
	        	emp1=emp;
	        }
        }
		return emp1;
       
      }
    public List<Employee> updateEmployee(Employee emp,Integer id) {
    	if(employeeList == null) {
            employeeList = new ArrayList<>();
        }
        for(Employee emp1:employeeList) {
	        if(emp1.getId().equals(id)) {
	        	employeeList.remove(emp1);
	        }else {
	        	
	        }
        }
        employeeList.add(emp);
		return employeeList;
       
      }
    
    public List<Employee> deleteEmployee(Integer id) {
    	if(employeeList == null) {
            employeeList = new ArrayList<>();
        }
        for(Employee emp1:employeeList) {
	        if(emp1.getId().equals(id)) {
	        	employeeList.remove(emp1);
	        }
        }
     	return employeeList;
       
      }
}
