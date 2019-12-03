package calculatorpackage;

public class Calculator {

	public String subtract(int num1, int num2) {
		return  "The result is " + (num1 - num2);
	}
	
	public String subtractDec(double num1, double num2) {
		return  "The result is " + (num1 - num2);
	}
	
	public String add(int number1, int number2) {
		int number = number1 + number2;
		return "The result is " + number;
	}

	public String addDec(double number3, double number4) {
		float number = (float) (number3 + number4);
		return "The result is " + number;
	}

}
