package introduction.conditions;

public class conditions {
    public static void main(String[] args) {
        int a= 100;
        int b= 300;
        if (a>b){
            System.out.println(a+" is grater than the "+ b);
        }else {
            System.out.println(b+" is grater than the "+ a);
        }

        //******************************** Short hand if else ****************************\\
        int time = 11;
        String result = (time <= 12) ? "Good Morning." : "Good evening.";
        System.out.println(result);
        
    }
           
}
/*******************************IF ********************************* */
/*
if (condition 1){
            //body
        } 
        */
/*******************************IF ELSE *****************************/
/*Sytax:
        if (condition 1){
            //body
        }else{
            //body
        }
 */
/******************************NESTED IF  ***********************/
 /*
  * if (condition 1){
            //body
        }else if{
            //body
        }else if{
            //body
        }else{
            //body
        }
  */
 
 
