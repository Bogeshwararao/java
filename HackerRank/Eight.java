package HackerRank;
import java.util.*;
public class Eight {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int B = in.nextInt();
            int H = in.nextInt();
            
            
            if (B>0 && H>0){
                System.out.println(B*H);
            }else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
}
}
