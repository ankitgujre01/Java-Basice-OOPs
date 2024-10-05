package com.employee;
import com.customer.Customer;
public class Employee
{
    int cust_id =0;
    public int gen_customer_id(String cust_name)
    {
        if(cust_name.equals(""))
        {
            return 0;
        }
        else
        {
            cust_id++;
        }
        return cust_id;
    }
    public static void main(String []str)
    {
        Employee manager = new Employee();
        Customer amit = new Customer();
        amit.setName("Amit Kumar");
        int id= manager.gen_customer_id(amit.getName());
        System.out.println("New Customer id"+"\t"+id);
        System.out.println(amit.getName());
    }
}