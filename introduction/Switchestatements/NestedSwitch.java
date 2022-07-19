package introduction.Switchestatements;
import java.util.Scanner;
public class NestedSwitch {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter ID");
            int empID = in.nextInt();
            System.out.println("Enter  Department");
            String department = in.next();
    
            switch (empID) {
                case 1:
                    System.out.println("Person 1");
                    break;
                case 2:
                    System.out.println("Person 2");
                    break;
                case 3:
                    System.out.println("Person 3");
                    switch (department) {
                        case "IT":
                            System.out.println("IT Department");
                            break;
                        case "Management":
                            System.out.println("Management Department");
                            break;
                        default:
                            System.out.println("No department entered");
                    }
                    break;
                default:
                    System.out.println("Enter correct EmpID");
            }
        }
}
