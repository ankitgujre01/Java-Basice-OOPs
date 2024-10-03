import javax.swing.*;

class MainEmployee{
    String name;
    String addr;
    String email;
    double salary;

    void setDetails(){
        name = JOptionPane.showInputDialog("enter employee name");
        addr = JOptionPane.showInputDialog("enter employee address");
        email = JOptionPane.showInputDialog("enter employee email");
        salary =Double.parseDouble(JOptionPane.showInputDialog("enter employee salary"));
    }
    void getDetails(){
        JOptionPane.showMessageDialog(null, "Employee Name" + " " + name);
        JOptionPane.showMessageDialog(null, "Employee adress" + " " + addr);
        JOptionPane.showMessageDialog(null, "Employee email" + " " + email);
        JOptionPane.showMessageDialog(null, "Employee salary" + " " + salary);
    }
}
public class Employee {
    public static void main(String[] args) {

        MainEmployee emp = new MainEmployee();
        emp.setDetails();
        emp.getDetails();

    }
}
