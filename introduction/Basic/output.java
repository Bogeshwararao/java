package introduction.Basic;
import java.util.Scanner;  // We have to import this to get input from the user

public class output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x=input.nextLine();// This is to take the string input 
        /*That the input data type should be mentioned like below:
             // int x=input.nextInt();
             //  Char x=input.next();
        Here the next() && nextLine() has some diffrence that the next will take only the one word and nextLine() wil take the entire line...:)
         */
        System.out.println(x);
    }
}
