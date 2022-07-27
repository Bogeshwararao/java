package HackerRank;
import java.io.*;
import java.util.*;
public class outputformate {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        String ch = input.next();
        int i = input.nextInt();
        System.out.printf("%-15c%03%d",ch,i);
        String c = input.next();
        int j = input.nextInt();
         System.out.printf("%-15c%03%d",c,j);
        
        String a = input.next();
        int k = input.nextInt();
         System.out.printf("%-15c%03%d",a,k);
        
        System.out.println("================================");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
