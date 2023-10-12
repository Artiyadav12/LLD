package com.lld.employee;

import java.util.ArrayList;
import java.util.List;

public class SalesManager extends Employee{

    List<SalesPerson> reportee=new ArrayList<>();

    public SalesManager(String name,Double salary){
        super.Employee(name,salary);
    }

    public void addReportee(SalesPerson salesPeople){
        reportee.add(salesPeople);
    }

    public Double getSalary() {
       Double sum= reportee.stream().mapToDouble(SalesPerson::getSalesCount).sum();
        return super.getSalary()+.10*sum;
    }
}
