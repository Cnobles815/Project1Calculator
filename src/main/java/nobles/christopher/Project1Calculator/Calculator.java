package nobles.christopher.Project1Calculator;
import java.util.Random;
/**
 * Created by christophernobles on 9/11/16.
 */
public class Calculator {






    String nonsense = "Bob";


    public double calculateAdd (double userNum1, double userNum2) {

       return userNum1 + userNum2;
    }

    public double calculateMultiply (double userNum1, double userNum2) {

        return userNum1 * userNum2;
    }

    public double calculateSubtract (double userNum1, double userNum2) {

        return  userNum1 - userNum2;
    }

    public double calculateDivide (double userNum1, double userNum2) {

        return userNum1 / userNum2;
    }

    public String notAFrickinFunction () {
        String nonsense = "Dirt tier coder.";

        return nonsense;
    }

    public double calculateSquareRoot (double userNum1){

        return Math.sqrt(userNum1);
    }

    public String mentalBreakdown () {
        String lol = "I started a joke//\n  Which started the whole world//\n   Crying.";


        return lol;
    }

    public double calculateSquare (double userNum1) {

        return Math.pow( userNum1 , 2);
    }

    public double calculateSquareUp (double userNum2, double userNum1) {
        return Math.pow( userNum2, userNum1);
    }

    public Random calculateRandom () {

        Random a = new Random(99999999);

        return a;

    }

    public double calculateSine (double userNum1, double userNum2) {

      return Math.sin(userNum1);
    }

    public double calculateCosine (double userNum1, double userNum2) {


      return Math.cos(userNum1);
    }

    public double calculateTangent (double userNum1) {

      return Math.tan(userNum1);
    }

    public double calculateInvSine (double userNum1, double userNum2) {

      return Math.asin(userNum1);
    }

    public double calculateInvCoSine (double userNum1, double userNum2) {

       return Math.acos(userNum1);
    }

    public double calculateInvTangent (double userNum1) {

       return Math.atan(userNum1);
    }



}