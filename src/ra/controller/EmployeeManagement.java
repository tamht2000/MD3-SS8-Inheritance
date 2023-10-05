package ra.controller;

import ra.baitap.Developer;
import ra.baitap.Employee;
import ra.baitap.SaleEmployee;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee employee1 = new SaleEmployee(1, "Hiếu", 27, "English");
        Employee employee2 = new Developer(2, "Nam", 29, "Việt");
        employee1.chamCong();
        employee1.work();
        employee2.chamCong();
        employee2.work();
        System.out.println("--------------");
        System.out.println("Sale");
        doing(employee1);
        System.out.println("Developer");
        doing(employee2);
    }

    public static void doing(Employee employee) {
        if(employee instanceof Developer){
            ((Developer) employee).fixbug();
        } else if(employee instanceof SaleEmployee) {
            ((SaleEmployee) employee).sale();
        }
    }
}
