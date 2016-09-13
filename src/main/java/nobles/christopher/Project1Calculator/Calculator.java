package nobles.christopher.Project1Calculator;
import java.util.Random;
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
        String lol = "I started a joke//\n  Which started the whole world//\n   Crying.";


        return lol;
    }

    public double calculateSquare (int userNum1) {
        double sqr = Math.pow( userNum1 , 2);

        return sqr;

    }

    public double calculateSquareUp (int userNum2, int userNum1) {
        double sqrU = Math.pow( userNum2, userNum1);

        return sqrU;

    }

    public Random calculateRandom () {

        Random a = new Random(99999999);

        return a;

    }

    public double calculateSine (int userNum1) {

        double sined = Math.sin(userNum1);

        return sined;

    }

    public double calculateCosine (int userNum1) {

        double coSined = Math.cos(userNum1);

        return coSined;
    }

    public double calculateTangent (int userNum1) {

        double tanged = Math.tan(userNum1);

        return tanged;
    }

    public double calculateInvSine (int userNum1) {

        double invSined = Math.asin(userNum1);

        return invSined;
    }

    public double calculateInvCoSined (int userNum1) {

        double invCoSined = Math.acos(userNum1);

        return invCoSined;
    }

    public double calculateInvTangent (int userNum1) {

        double invTangent = Math.atan(userNum1);

        return invTangent;
    }



}