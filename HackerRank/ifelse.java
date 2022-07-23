package HackerRank;
import java.util.Scanner;
public class ifelse {
            public static void main(String[] args) {
                      Scanner in=new Scanner(System.in);
                      int N= in.nextInt();
                      if(N%2 == 0)
                      {
                          if(N>=2 && N<=5)
                          {
                              System.out.println("Not Weird");
                          }
                          else if(N>=6 && N<=20)
                          {
                              System.out.println("Weird");
                          }
                          else
                          {
                              System.out.println("Not Weird");
                          } 
                      }
                      else
                      {
                          System.out.println("Weird");
                      }

            }    
}
