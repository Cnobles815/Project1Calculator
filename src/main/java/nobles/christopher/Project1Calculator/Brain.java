package nobles.christopher.Project1Calculator;

/**
 * Created by christophernobles on 9/11/16.
 */
public class Brain {

    Display display;
    Calculator calculator;
    boolean onOff = true;
    State state = new State();

    public Brain(){
        this.display = new Display();
        this.calculator = new Calculator();

    }

    public void mainMenu() {
        //options list
        System.out.println(state.getStateValue());
        char userInput = display.getUserMenuChoice();
        switch (userInput) {
            case 'A':
                mathMenu();
                break;
            case 'B':
                stateMenu();
                break;
            case 'Q':
                System.out.println("You may leave.");
                return;
            default:
                System.out.println("Invalid.");
                mainMenu();
                break;
        }
    }


    public void mathMenu() {
        char userInput = display.getUserInputOperator();
        switch (userInput) {
            case 'C':
                state.setStateValue(calculator.calculateAdd(state.getStateValue(), display.getUserInput()));
                break;
            case 'D':
                state.setStateValue(calculator.calculateSubtract(state.getStateValue(), display.getUserInput()));
                break;
            case 'B':
                state.setStateValue(calculator.calculateDivide(state.getStateValue(), display.getUserInput()));
                break;
            case 'A':
                state.setStateValue(calculator.calculateMultiply(state.getStateValue(), display.getUserInput()));
                break;
            case 'I':
                state.setStateValue(calculator.calculateCosine(state.getStateValue()));
                break;
            case 'H':
                state.setStateValue(calculator.calculateSine(state.getStateValue()));
                break;
            case 'F':
                state.setStateValue(calculator.calculateSquare(state.getStateValue()));
                break;
            case 'E':
                state.setStateValue(calculator.calculateSquareRoot(state.getStateValue()));
                break;
            case 'G':
                state.setStateValue(calculator.calculateSquareUp(state.getStateValue() , display.getUserInput()));
                break;
            case 'L' :
                state.setStateValue(calculator.calculateInvCoSine(state.getStateValue()));
                break;
            case 'J' :
                state.setStateValue(calculator.calculateTangent(state.getStateValue()));
                break;
            case 'M':
                state.setStateValue(calculator.calculateInvTangent(state.getStateValue()));
                break;
            case 'K':
                state.setStateValue(calculator.calculateInvSine(state.getStateValue()));
                break;
            default:
                System.out.println("Invalid.");
                break;
        }
        mainMenu();
    }

    public void stateMenu() {
        char userInput = display.getUserStateChoice();
        switch (userInput) {
            case 'A':
                System.out.println(state.getStateValue());
                break;
            case 'B':
                state.setStateValue(display.getUserInput());
                break;
            case 'C':
                state.setStateValue(0);
                break;
            default:
                System.out.println("Invalid.");
                stateMenu();
                break;
        }
        mainMenu();
    }

    public void modeMenu () {
        String userMode = display.getMode();




    }
}


