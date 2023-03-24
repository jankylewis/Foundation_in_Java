package ProgramEngineering.ProgrammingTechniques.ExceptionHandling;

import ProgramEngineering.ProgrammingTechniques.CustomizedException.NumberException;

public class ElementaryCalculator {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int divide2Nums() throws NumberException {
        int dividedResult = -1;
        try {
            dividedResult = this.num1 / this.num2;
        } catch (Exception exception) {
            throw new NumberException();
        }
        return dividedResult;
    }

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        ElementaryCalculator elementaryCalculator = new ElementaryCalculator();
        elementaryCalculator.setNum1(num1);
        elementaryCalculator.setNum2(num2);
        boolean isErr = false;
        String errMessage = "";
        int dividedResult = -1;

        //need to add try catch block again to be inherited from divide2Nums method
        /*  we should have used exactly the type of exception from the parent method (ArithmeticException)
            but in this case, because ArithmeticException is extended from Exception, hence we just need to use Exception
         */
        try {
            dividedResult = elementaryCalculator.divide2Nums();
        } catch (NumberException numberException) {
            isErr = true;
            errMessage = numberException.toString();
        }
        if (isErr) {
            System.out.println("[ERR] " + errMessage);
        }
        System.out.printf("Result after being divided = %d", dividedResult);
    }
}
