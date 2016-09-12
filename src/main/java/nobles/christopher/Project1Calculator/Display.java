package nobles.christopher.Project1Calculator;

import java.util.Scanner;


public class Display {

    //Prompt the user for input
    //Take user input
    //Display answer
    public int getUserInput1() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter integer.");
        return userInput.nextInt();

    }

    public int getUserInput2() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter integer.");
        return userInput.nextInt();

    }

    public String getUserInputStr() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("I bet you needed to calculate something.");
        System.out.println("\nThis app might do that. It might also return the current value of the 'coder' who wrote this. That is a feature. Not a bug.");
        System.out.println("\nBut you're here to roast my code. So go ahead. Flip that coin.");
        System.out.println("\nChoose mode (Multiply, Divide, Add, Subtract, Root, Square, RaisedTo, Feelings).");
        String str = new String (userInput.next());
        String cased = str.toUpperCase();
        return cased;

    }


    public void showResult (int output) {
        System.out.println("Your answer is: " + output);

    }

    public void showBadResult (String output) {
        System.out.println(output);
    }

    public void showDoubleResult (double output){
        System.out.println(output);
    }

}