package nobles.christopher.Project1Calculator;

/**
 * Created by christophernobles on 9/11/16.
 */
public class Brain {

    Display display;
    Calculator calculator;

    public Brain(){

        this.display = new Display();
        this.calculator = new Calculator();

    }

    public void setMode(boolean b) {

        String userInput1 = display.getUserInputStr();

        if (userInput1.equals("ADD"))
            display.showResult(calculator.calculateAdd(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("MULTIPLY"))
            display.showResult(calculator.calculateMultiply(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("DIVIDE"))
            display.showResult(calculator.calculateDivide(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("SUBTRACT"))
            display.showResult(calculator.calculateSubtract(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("ROOT"))
            display.showDoubleResult(calculator.calculateSquareRoot(display.getUserInput1()));

        if (userInput1.equals("SQUARE"))
            display.showDoubleResult(calculator.calculateSquare(display.getUserInput1()));

        if (userInput1.equals("RAISEDTO"))
            display.showDoubleResult(calculator.calculateSquareUp(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("FEELINGS"))
            display.showBadResult(calculator.mentalBreakdown());

        if (userInput1.equals("OFF"))
            calculator.calculatorOff();


        else
            display.showBadResult(calculator.notAFrickinFunction());
    }


}