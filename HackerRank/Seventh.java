/****************************SUB STRING*********************/


package HackerRank;
import java.util.Scanner;
public class Seventh {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        String word = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(word.substring(start,end));
            }
}
