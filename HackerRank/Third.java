//***************************STD IN AND STD OUT************** */

package HackerRank;
import java.util.Scanner;
public class Third {
          public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        
            int i = scan.nextInt();
            String s = scan.nextLine();
            Double doubl= scan.nextDouble();
            s=scan.nextLine();
            // Write your code here.
            if (s.isEmpty()){
                s=scan.nextLine();
            }
            
            System.out.println("String: " + s);
            System.out.println("Double: " + doubl);
            System.out.println("Int: " + i);
          }
}
