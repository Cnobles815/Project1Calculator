package nobles.christopher.Project1Calculator;

/**
 * Created by christophernobles on 9/12/16.
 */
public class AnswerFormat {

    Display display;
    //Calculator calculator;
    //Brain brain;
    setOutput settingInput;
    String setting;

     enum setOutput {HEXIDECIMAL(), BINARY(), OCTAL(), DECIMAL()}
     //String settingInput1 = display.setSetting();


       // public AnswerFormat(){

            //settingInput = s

        //}





        public void setSettingOct () {
            System.out.println("OCTAL OUTPUT");
            settingInput = setOutput.OCTAL;
        }

        public void setSettingDec () {
            System.out.println("[[DECIMAL OUTPUT]]");
            settingInput = setOutput.DECIMAL;
        }

        public void setSettingHex () {
            System.out.println("[[HEXIDECIMAL OUTPUT]]");
            settingInput = setOutput.HEXIDECIMAL;
        }

        public void setSettingBin () {
            System.out.println("[[BINARY OUTPUT]]");
            settingInput = setOutput.BINARY;
        }


        public String conversion(double output) {

            //setOutput set = setOutput.toString()[settingInput1];


            switch (settingInput) {
                case HEXIDECIMAL:
                    return Integer.toHexString((int) output);
                    //break;


                case OCTAL:
                    return Integer.toOctalString((int) output);
                    //break;


                case BINARY:
                    return Integer.toBinaryString((int) output);
                    //break;


                case DECIMAL:
                    return (output + "");
                //break;

                default:
                    return (output + "");
            }
        }









     /*  this.display = new Display();
        this.calculator = new Calculator();
        this.brain = new Brain();
        this.answerFormat = new AnswerFormat();
    }

    int displayNum1 = display.getUserInput1();
    int displayNum2 = display.getUserInput2();

    public int setOutput(){

        int saved = displayNum1;
        int saved2 = displayNum2;

        return saved;


    }*/


}
