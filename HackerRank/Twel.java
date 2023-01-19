package HackerRank;

public class Twel {
    public static void main(String[] args) {
        int year=2004;
        if( year%4==0 && year%100==0){
            System.out.println("Leap year.");
        }else if (year %4==0 && year%100==0 && year%400==0){
            System.out.println("Leap year.");
        }else {
            System.out.println("Not leap year.");
        }

    }
}
