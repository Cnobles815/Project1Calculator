package nobles.christopher.Project1Calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 9/11/16.
 */
public class CalculatorTestClass {
   /* @Test
    public void calculateAdd() throws Exception {


    }

    @Test
    public void calculateMultiply() throws Exception {

    }

    @Test
    public void calculateSubtract() throws Exception {

    }

    @Test
    public void calculateDivide() throws Exception {

    }

    @Test
    public void notAFrickinFunction() throws Exception {

    }

    @Test
    public void calculateSquareRoot() throws Exception {

    }

    @Test
    public void mentalBreakdown() throws Exception {

    }

    @Test
    public void calculateSquare() throws Exception {

    }

    @Test
    public void calculateSquareUp() throws Exception {

    }

    @Test
    public void calculateRandom() throws Exception {

    }

    @Test
    public void calculateSine() throws Exception {

    }

    @Test
    public void calculateCosine() throws Exception {

    }

    @Test
    public void calculateTangent() throws Exception {

    }

    @Test
    public void calculateInvSine() throws Exception {

    }

    @Test
    public void calculateInvCoSine() throws Exception {

    }

    @Test
    public void calculateInvTangent() throws Exception {

    }*/
    //Learned late that I could have one Calculator for the whole thing.
    //Commented out Calculators are relics.
    //So no one thinks I'm a better coder than I am.

    public Calculator calculatorTEST = new Calculator();

    @Test
    public void calculateAddTEST() {
        //Calculator calculatorTEST = new Calculator();
        int expectedValue = 10 ;
        int actualValue = calculatorTEST.calculateAdd(5,5);
        assertEquals("The value should be 0" , expectedValue, actualValue);


    }

    @Test
    public void calculateMultiplyTEST() {
        //Calculator calculatorTEST = new Calculator();

        int expectedValue = 25 ;
        int actualValue = calculatorTEST.calculateMultiply(5,5);
        assertEquals("The value should be 10" , expectedValue, actualValue);


    }

    @Test
    public void calculateSubtractTEST() {
        //Calculator calculatorTEST = new Calculator();

        int actualValue = calculatorTEST.calculateSubtract(6, 5);
        int expectedValue = 1;
        assertEquals("The value should be 1" , actualValue, expectedValue);

    }

    @Test
    public void calculateDivideTEST() {
        //Calculator calculatorTEST = new Calculator();

        int actualValue = calculatorTEST.calculateDivide(14, 7);
        int expectedValue = 2;
        assertEquals("The value should be 2" , actualValue, expectedValue);
    }

    @Test
    public void notAFrickinFunctionTEST() {
        //Calculator calculatorTEST = new Calculator();

        String actualValue = calculatorTEST.notAFrickinFunction();
        String expectedValue = "Dirt tier coder.";
        assertEquals("The return should be \"Dirt tier coder.\"" , actualValue, expectedValue);

    }

    @Test
    public void calculateSquareRootTEST() {
        //Calculator calculatorTEST = new Calculator();

        double actualValue = calculatorTEST.calculateSquareRoot(4);
        double expectedValue = 2;
        assertEquals("The value should be 2" , actualValue, expectedValue, 0);
    }

    @Test
    public void mentalBreakdownTEST() {
        //Calculator calculatorTEST = new Calculator();

        String actualValue = calculatorTEST.mentalBreakdown();
        String expectedValue = "At least I give good speeches.";
        assertEquals("The return should be \"At least I give good speeches.\"" , actualValue, expectedValue);

    }

    @Test
        public void calculateSquareTEST() {

        double actualValue = calculatorTEST.calculateSquare(4);
        double expectedValue = 16;
        assertEquals("The value should be 16" , actualValue, expectedValue, 0);
    }

    @Test
    public void calculateSquareUpTEST() {

        double actualValue = calculatorTEST.calculateSquareUp(3, 3);
        double expectedValue = 9;
        assertEquals("The value should be 9" , actualValue, expectedValue, 0);
    }

    @Test
    public void calculateSineTEST () {


    }
}
