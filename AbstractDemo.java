import jdk.nio.mapmode.ExtendedMapMode;

import javax.swing.*;
//Dynamic polyorphism.

abstract class Employee{
    abstract double calculateSalary();
}
class Manager extends Employee {               //Implementation class
    @Override
    double calculateSalary() {
        double salary = Integer.parseInt(JOptionPane.showInputDialog("Enter manager salary"));
        double ta = (salary * 10)/100;
        double pf = (salary*12)/100;
        double net_salary = (salary + ta) - pf;
        return net_salary;
//        return 0;
    }
}
class Accountant extends Employee{
    @Override
    double calculateSalary() {
        double salary = Integer.parseInt(JOptionPane.showInputDialog("Enter Accountant salary"));
        double ta = (salary * 10)/100;
        double pf = (salary*12)/100;
        double net_salary = (salary + ta) - pf;
        return net_salary;
//        return 0;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Employee obj = new Manager();
        double result =  obj.calculateSalary();
        System.out.println("result = " + result);

        obj = new Accountant();
//        obj.calculateSalary();
        System.out.println(" = " +obj.calculateSalary());
    }
}
