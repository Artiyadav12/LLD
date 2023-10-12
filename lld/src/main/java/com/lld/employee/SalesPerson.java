package com.lld.employee;

public class SalesPerson extends Employee{

    Integer salesCount;


    public  SalesPerson(String name, Double salary, Integer salesCount){
        super.Employee(name,salary);
        this.salesCount=salesCount;
    }

    public Integer getSalesCount() {
        return salesCount;
    }

    public Double getSalary() {
        return super.getSalary()+.10*salesCount;
    }
}
