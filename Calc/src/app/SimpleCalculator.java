package app;

public class SimpleCalculator implements Calculator {
    
    private double firstNumber;
    private double secondNumber;

    
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    
    @Override
    public double getSum() {
	
	return firstNumber+secondNumber;
    }

    @Override
    public double getSubtraction() {
	
	return firstNumber-secondNumber;
    }

   

    @Override
    public double getMultiplication() {
	return firstNumber*secondNumber;
    }

    @Override
    public double getDivision() {
	return firstNumber/secondNumber;
    }

    public SimpleCalculator(double firstNumber, double secondNumber) {
	super();
	this.firstNumber = firstNumber;
	this.secondNumber = secondNumber;
    }

    

}
