package Prac28July;

public class SimpleCalculator {
    // write your code here
    private double firstNumber,secondNumber;
    
    public double getFirstNumber() {return firstNumber;}
    
    public double getSecondNumber() {return secondNumber;}
    
    public void setFirstNumber(double num) {firstNumber=num;}
    
    public void setSecondNumber(double num) {secondNumber=num;}
    
    public double getAdditionResult() {return firstNumber+secondNumber;}
    
    public double getSubtractionResult() {return firstNumber-secondNumber;}
    
    public double getMultiplicationResult() {return firstNumber*secondNumber;}
    
    public double getDivisionResult() {
    	if(secondNumber==0)
    		return 0;
    	else
    		return firstNumber/secondNumber;
    	}
}
