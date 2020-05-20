package app;

public class SimpleCalculator implements Calculator {
    
    private int firstNumber;
    private int secondNumber;

    
    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    
    @Override
    public int getSum() {
	
	return firstNumber+secondNumber;
    }

    @Override
    public int getSubtraction() {
	
	return firstNumber-secondNumber;
    }

   

    @Override
    public int getMultiplication() {
	return firstNumber*secondNumber;
    }

    @Override
    public int getDivision() {
	return firstNumber/secondNumber;
    }

    public SimpleCalculator(int firstNumber, int secondNumber) {
	super();
	this.firstNumber = firstNumber;
	this.secondNumber = secondNumber;
    }

    

}
