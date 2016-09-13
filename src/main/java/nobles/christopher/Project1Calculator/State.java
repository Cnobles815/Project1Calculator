package nobles.christopher.Project1Calculator;

/**
 * Created by christophernobles on 9/12/16.
 */
public class State {

    //Display display;
    //Calculator calculator;
    //Brain brain;
    setState setting;

    private enum setState {HEXIDECIMAL, BINARY, OCTAL, DECIMAL}

        public State(){

            setting = State.setState.DECIMAL;

        }

        public String conversion(double output) {

            switch (setting) {
                case HEXIDECIMAL:
                    return Integer.toHexString((int) output);
                //break;
            }

            switch (setting) {
                case OCTAL:
                    return Integer.toHexString((int) output);
                //break;
            }

            switch (setting) {
                case BINARY:
                    return Integer.toHexString((int) output);
                //break;
            }

            switch (setting) {
                case DECIMAL:
                    return Integer.toHexString((int) output);
               // break;
            }
        return Integer.toHexString((int)output);
        }









     /*  this.display = new Display();
        this.calculator = new Calculator();
        this.brain = new Brain();
        this.state = new State();
    }

    int displayNum1 = display.getUserInput1();
    int displayNum2 = display.getUserInput2();

    public int setState(){

        int saved = displayNum1;
        int saved2 = displayNum2;

        return saved;


    }*/


}
