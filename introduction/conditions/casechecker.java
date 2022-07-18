package introduction.conditions;
import java.util.Scanner;
public class casechecker {
    public static void main(String[] args) {
        while(true){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a letter");
         char ch = input.next().trim().charAt(0);
         if(ch > 'a' && ch <'z' ){
            System.out.println("Lower case");
         }else {
            System.out.println("Upper case");
         }
    }}
}
