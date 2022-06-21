package com.home.employeeprj.test;

import com.home.employeeprj.entity.Employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1=new Employee("Aziz Sancar");
        Employee emp2=new Employee("Uğur Coşkun");

        emp1.setAge(70);
        emp1.setDesignation("DNA Bilimi");
        emp1.setSalary(2000);
        System.out.println(emp1);
        emp1.printEmployee();

        emp2.setAge(60);
        emp2.setDesignation("Biyoteknoloji");
        emp2.setSalary(10000000);
        System.out.println(emp2);
        emp2.printEmployee();
    }
}
