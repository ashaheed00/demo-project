package com.aksh;

import java.util.Locale;

public class Employee {
    private int empId;
    protected String name;
    int salary;

    final String COMPANY_NAME = "AB";

    public Employee() {
    }

    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    protected String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.empId = 10;
        emp.name = "Rahul";
    }


}
