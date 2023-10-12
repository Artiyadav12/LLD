package com.lld.employee;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args){

        SalesPerson salesPerson1=new SalesPerson("abc",20000.0,3);
        SalesPerson salesPerson2=new SalesPerson("xyz",30000.0,4);

        SalesManager manager=new SalesManager("Arti",3000000.0);


        manager.addReportee(salesPerson1);
        manager.addReportee(salesPerson2);

        List<Employee> employees=new ArrayList<>();
        employees.add(salesPerson1);
        employees.add(salesPerson2);
        employees.add(manager);


        for (Employee em:employees) {

            System.out.println(em.getName()+" get salary "+em.getSalary());
        }


    }
}
