package com.aksh.demo;

import com.aksh.Employee;

public class EmployeeApp extends Employee {



    public void abc(Employee emp1){
        this.name = "John";
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmpId(10);
        EmployeeApp app =  new EmployeeApp();
        app.name = "John";
        System.out.println(emp.getEmpId());
    }

}
