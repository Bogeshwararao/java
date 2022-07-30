/************************PRIME CHECKER****************************** */


package HackerRank;
import java.util.*;
import java.math.*;
public class Tenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        boolean b = n.isProbablePrime(1);
        if (b){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
