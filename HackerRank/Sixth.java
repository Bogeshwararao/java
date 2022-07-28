//***********************LOOP (TABLE)************* */


package HackerRank;
import java.util.*;
public class Sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1 ; i<=10; i++){
            int  y = n*i;
            System.out.println(n+" x " +i+ " = " + y);
        }
    }
}
