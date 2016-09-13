package nobles.christopher.Project1Calculator;

/**
 * Created by christophernobles on 9/11/16.
 */
public class Brain {

    Display display;
    Calculator calculator;
    AnswerFormat modeset;
    boolean onOff = true;

    public Brain(){

        this.display = new Display();
        this.calculator = new Calculator();

    }

    public void setMode() {

        String userInput1 = display.getUserInputOperator();
        String userMode = display.getMode();


        if (userInput1.equals("ADD")) {
            //System.out.println(display.getUserInput1() + "+");
            display.showResultInt(calculator.calculateAdd(display.getUserInput1(), display.getUserInput2()));
            display.getMode();
            if (userMode.equals("OCTAL"))
                modeset.setSettingOct();


            if (userMode.equals("HEXIDECIMAL"))
                modeset.setSettingHex();


            if (userMode.equals("BINARY"))
                modeset.setSettingBin();


            if (userMode.equals("DECIMAL"))
                modeset.setSettingDec();

        }

        if (userInput1.equals("MULTIPLY")) {
            display.showResultInt(calculator.calculateMultiply(display.getUserInput1() , display.getUserInput2()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }



        if (userInput1.equals("DIVIDE")) {
            display.showResultInt(calculator.calculateDivide(display.getUserInput1() , display.getUserInput2()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }

        if (userInput1.equals("SUBTRACT")) {
            display.showResultInt(calculator.calculateSubtract(display.getUserInput1() , display.getUserInput2()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }

        if (userInput1.equals("ROOT")) {
            display.showResultDouble(calculator.calculateSquareRoot(display.getUserInput1()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }
        if (userInput1.equals("SQUARE")) {
            display.showResultDouble(calculator.calculateSquare(display.getUserInput1()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }
        if (userInput1.equals("RANDOM")) {
            display.showResultRandom(calculator.calculateRandom());
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }
        if (userInput1.equals("RAISEDTO")) {
            display.showResultDouble(calculator.calculateSquareUp(display.getUserInput1() , display.getUserInput2()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }

        if (userInput1.equals("FEELINGS")) {
            display.showBadResult(calculator.mentalBreakdown());
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }

        if (userInput1.equals("SINE")) {
            display.showResultDouble(calculator.calculateSine(display.getUserInput1()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }

        if (userInput1.equals("COSINE")) {
            display.showResultDouble(calculator.calculateCosine(display.getUserInput1()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }

        if (userInput1.equals("TANGENT")) {
            display.showResultDouble(calculator.calculateTangent(display.getUserInput1()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }

        if (userInput1.equals("INVSINE")) {
            display.showResultDouble(calculator.calculateInvSine(display.getUserInput1()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }

        if (userInput1.equals("INVCOSINE")) {
            display.showResultDouble(calculator.calculateInvCoSine(display.getUserInput1()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }

        if (userInput1.equals("INVTANGENT")) {
            display.showResultDouble(calculator.calculateInvTangent(display.getUserInput1()));
            display.getMode();
            if (userMode.equals("OCTAL")) {
                modeset.setSettingOct();
            }

            if (userMode.equals("HEXIDECIMAL")) {
                modeset.setSettingHex();
            }

            if (userMode.equals("BINARY")) {
                modeset.setSettingBin();
            }

            if (userMode.equals("DECIMAL")) {
                modeset.setSettingDec();
            }
        }

        if (userInput1.equals("QUIT")) {
            this.onOff = false;
            System.out.println("You may leave, scrub.");
        }


    }
        //else
            //display.showBadResult(calculator.notAFrickinFunction());
}


