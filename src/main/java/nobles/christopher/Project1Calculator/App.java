package nobles.christopher.Project1Calculator;


/**
 * Created by christophernobles on 9/11/16.
 */
public class App {

    //static boolean onOff = true;
    Display display;
    Calculator calculator;



    public static void main(String[] args) {
        Brain start = new Brain();
        //This thing does not turn off. Weep.
        while (start.onOff == true)
            start.setMode();
            }

        }



