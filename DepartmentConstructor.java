import javax.swing.*;

class Department{
    int dept_id;
    String dept_name;
    String dept_head;

    public Department(){
        dept_id = 0;
        dept_name = null;
        dept_head = null;
    }
    public Department(int dept_id, String dept_name){
        this.dept_id = dept_id;
        this.dept_name = dept_name;
    }
    public Department(int dept_id, String dept_name, String dept_head){
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.dept_head = dept_head;
    }
    public void print(){
        System.out.println("dept_id = " + dept_id);
        System.out.println("dept_name = " + dept_name);
        System.out.println("dept_head = " + dept_head);
    }
}
public class DepartmentConstructor {
    public static void main(String[] args) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter Depart ID"));
        String head = JOptionPane.showInputDialog("Enter Department Head");
        String name = JOptionPane.showInputDialog("enter Department name");
        Department CS = new Department();
        CS.print();
        Department IT = new Department(01, "Information Technology");
                IT.print();
        Department AIML = new Department(111, "AIML", "kalapana rai");
    }
}