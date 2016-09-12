package nobles.christopher.Project1Calculator;

/**
 * Created by christophernobles on 9/11/16.
 */
public class Calculator {

     int sum = 0;
     int product = 1;
     int subtract = 0;
     int divide = 0;




    String nonsense = "Bob";


    public int calculateAdd (int userNum1, int userNum2) {

        sum = userNum1 + userNum2;

        return sum;
    }

    public int calculateMultiply (int userNum1, int userNum2) {

        product = userNum1 * userNum2;

        return product;
    }

    public int calculateSubtract (int userNum1, int userNum2) {

        subtract = userNum1 - userNum2;

        return subtract;
    }

    public int calculateDivide (int userNum1, int userNum2) {

        divide = userNum1 / userNum2;

        return divide;

    }

    public String notAFrickinFunction () {
        String nonsense = "Dirt tier coder.";

        return nonsense;
    }

    public double calculateSquareRoot (int userNum1){

        double sRt = Math.sqrt(userNum1);

        return sRt;
    }

    public String mentalBreakdown () {
        String hopelessness = "At least I give good speeches.";


        return hopelessness;
    }

    public double calculateSquare (int userNum1) {
        double sqr = Math.pow( 3, userNum1);

        return sqr;

    }

    public double calculateSquareUp (int userNum2, int userNum1) {
        double sqrU = Math.pow( userNum2, userNum1);

        return sqrU;

    }



}