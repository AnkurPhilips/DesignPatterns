package com.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234","John","Wick","john@wick.com");

        EmployeeLdap employeeLdap = new EmployeeLdap("1234","John","Wick","john@wick.com");
        employeeList.add(employeeFromDB);
        employeeList.add(new EmployeeAdapterLdap(employeeLdap));
        return employeeList;
    }
}
