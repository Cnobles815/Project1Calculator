package nobles.christopher.Project1Calculator;

/**
 * Created by christophernobles on 9/11/16.
 */
public class Brain {

    Display display;
    Calculator calculator;
    boolean onOff = true;

    public Brain(){

        this.display = new Display();
        this.calculator = new Calculator();

    }

    public void setMode() {

        String userInput1 = display.getUserInputOperator();


        if (userInput1.equals("ADD"))
            display.showResult(calculator.calculateAdd(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("MULTIPLY"))
            display.showResult(calculator.calculateMultiply(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("DIVIDE"))
            display.showResult(calculator.calculateDivide(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("SUBTRACT"))
            display.showResult(calculator.calculateSubtract(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("ROOT"))
            display.showResult(calculator.calculateSquareRoot(display.getUserInput1()));

        if (userInput1.equals("SQUARE"))
            display.showResult(calculator.calculateSquare(display.getUserInput1()));

        if (userInput1.equals("RANDOM"))
            display.showResult(calculator.calculateRandom());

        if (userInput1.equals("RAISEDTO"))
            display.showResult(calculator.calculateSquareUp(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("FEELINGS"))
            display.showBadResult(calculator.mentalBreakdown());

        if (userInput1.equals("SINE"))
            display.showResult(calculator.calculateSine(display.getUserInput1()));

        if (userInput1.equals("COSINE"))
            display.showResult(calculator.calculateCosine(display.getUserInput1()));

        if (userInput1.equals("TANGENT"))
            display.showResult(calculator.calculateTangent(display.getUserInput1()));

        if (userInput1.equals("INVSINE"))
            display.showResult(calculator.calculateInvSine(display.getUserInput1()));

        if (userInput1.equals("INVCOSINE"))
            display.showResult(calculator.calculateInvSine(display.getUserInput1()));

        if (userInput1.equals("INVTANGENT"))
            display.showResult(calculator.calculateInvTangent(display.getUserInput1()));

        if (userInput1.equals("QUIT")) {
            this.onOff = false;
            System.out.println("You may leave, scrub.");
        }

        //else
            //display.showBadResult(calculator.notAFrickinFunction());
    }


}