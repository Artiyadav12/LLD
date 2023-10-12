package com.lld.employee;

public class Employee {

    String name;
    Double salary;

    public void Employee(String name,Double salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }
}
