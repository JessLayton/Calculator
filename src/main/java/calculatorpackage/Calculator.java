package calculatorpackage;

public class Calculator {

	public String division(double number1, double number2) {
		
		
		if (number2 == 0) {
			return "Dont't divide by 0, you'll break maths";
			
		} else {
			double num3 = number1/number2;
		return "The result is " + num3;
		}
		
		

	}
}
