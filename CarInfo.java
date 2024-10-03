// import javax.swing.*;
import java.util.Scanner;
// inner classes
class Car{
    String name = " Honda";
    String model = "alto100";
    //one more class add
    class engine{
        public void setData(Scanner scanner){
//            System.out.println(name);
//            System.out.println(model);

            //GUI inpute
           /* name = JOptionPane.showInputDialog("enter car name " + " ");
            model = JOptionPane.showInputDialog("enter model Model " + " ");*/
            System.out.println("Enter Car Name :");
            name = scanner.nextLine();

            System.out.println("Enter Model Name:");
            model = scanner.nextLine();
        }
        public void getData(){
//            JOptionPane.showMessageDialog(null, "Car Name " + "= " + name);
//            JOptionPane.showMessageDialog(null, "Model Model " + "= " + model);
            System.out.println("Car name = " + name);
            System.out.println("Car model = " + model);
        }
    }
}

public class CarInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car output = new Car();
        Car.engine innerCar = output.new engine();
        innerCar.setData(scanner);
        innerCar.getData();
    }
}
