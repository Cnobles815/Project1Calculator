package nobles.christopher.Project1Calculator;

/**
 * Created by christophernobles on 9/13/16.
 */
public class State {

    enum OutputModes {BINARY, OCTAL, HEXIDECIMAL, DECIMAL}

    private OutputModes outputModes;

    private double stateValue;

    State() {
        stateValue = 0.0;
    }

    double getStateValue() {
        return stateValue;
    }

    void setStateValue(double a) {
        stateValue = a;
    }

    OutputModes getOutputModes() {
        return outputModes;
    }

    void setOutputModes(OutputModes mode) {
        outputModes = mode;
    }

}
