package nobles.christopher.Project1Calculator;

import java.util.Scanner;
import java.util.Random;

public class Display {
    Scanner userInput = new Scanner(System.in);

    //Prompt the user for input
    //Take user input
    //Display answer


    public String setSetting() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose Setting");
        return userInput.next();
    }

    public double getUserInput() {

        System.out.println("Enter integer.");
        //System.out.println(answerFormat.setOutput());
        return userInput.nextDouble();

    }

    public char getUserMenuChoice() {
        //draw
        System.out.println("[[Main Menu]]");


        return userInput.next().toUpperCase().charAt(0);
    }

    public char getUserStateChoice() {

        //draw A get state  B set state C
        System.out.println("[[State Menu]]" + "\n \n A: Get State \n B: Set State \n C: Revert State to Zero");

        return userInput.next().toUpperCase().charAt(0);

    }

    public char getUserInputOperator() {

        System.out.println("I bet you needed to calculate something. This app might do that.");
        System.out.println("It might also return a statement reflecting the current mental answerFormat of the 'coder' who wrote this." +
                "\nThat is a feature. Not a bug.");
        System.out.println("But you're here to roast my code. So go ahead. Flip that coin.");
        System.out.println("\n                      [[Choose Mode]]" +
                "\n \n A: Multiply, B: Divide " +
                "\n C: Add, D: Subtract, \nE: Root, F: Square, G: RaisedTo, " +
                "\nH: Sine, I: Cosine, J: Tangent, " +
                "\nK: InvSine, L: InvCosine, M: InvTangent" +
                //"\nN: Feelings, O: Random " +
                "\n \n(Type Q to mercifully end this tragic program.)");
        return userInput.next().toUpperCase().charAt(0);

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