package nobles.christopher.Project1Calculator;

import java.util.Scanner;
import java.util.Random;

public class Display {


    //Prompt the user for input
    //Take user input
    //Display answer
    AnswerFormat answerFormat = new AnswerFormat();

    public String setSetting() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose Setting");
        return userInput.next();
    }

    public int getUserInput1() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter integer.");
        //System.out.println(answerFormat.setOutput());
        return userInput.nextInt();

    }


    public int getUserInput2() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter integer.");
        return userInput.nextInt();

    }

    public String getUserInputOperator() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("I bet you needed to calculate something. This app might do that.");
        System.out.println("It might also return a statement reflecting the current mental answerFormat of the 'coder' who wrote this." +
                "\nThat is a feature. Not a bug.");
        System.out.println("But you're here to roast my code. So go ahead. Flip that coin.");
        System.out.println("\n                      [[Choose Mode]]" +
                "\n \nMultiply, Divide " +
                "\nAdd, Subtract, \nRoot, Square, RaisedTo, " +
                "\nSine, Cosine, Tangent, " +
                "\nInvSine, InvCosine, InvTangent" +
                "\nFeelings, Random " +
                "\n \n(Type QUIT to mercifully end this tragic program.)");
        String str = new String (userInput.next());
        String cased = str.toUpperCase();
        System.out.println("\n[[" +cased+ "]]");
        return cased;

    }

    public String getMode() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose your output mode." +
                "\n DECIMAL, HEXIDECIMAL, OCTAL, BINARY");
        String modePick = new String (userInput.next());
        String cased = modePick.toUpperCase();
        return cased;

    }



    public  int showResultInt(int output) {

        System.out.println("Your answer is: [[" + answerFormat.conversion(output) + "]] Which is \"probably\" correct. (JK I WROTE TESTS THIS STUFF IS BULLETPROOF)\n");

        return output;

    }

    public void showBadResult (String output) {

        System.out.println("\n" +output+ "\n :) \n");
    }

    public double showResultDouble(double output){
        System.out.println("Your answer is: [[" + answerFormat.conversion(output) + "]] TDD Told me so.\n");
        return output;
    }

    public void showResultRandom(Random output){
        System.out.println("Pointless Random Value: [[" + output + "]] I didn't test this. That's why it doesn't work.\n");
    }

}