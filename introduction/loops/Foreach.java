//************************FOR loop FOR array **********************/


package introduction.loops;

public class Foreach {
    public static void main(String[] args) {
        /******************SYNTAX**************/
        /*           for (type variableName : arrayName) {
                              code block to be executed
                        }
         
         */
        /******************EXAMPLE**************/
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
          System.out.println(i);
        }
    }
}
