package calculatorpackage;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
	
	@Test
	public void additionTest() {
		Calculator calc = new Calculator();
		String additionResult = calc.add(2,3);
		Assert.assertEquals("The result is 5",additionResult);
	}

	@Test
	public void subtractionTest() {
		Calculator calc = new Calculator();
		String subtractionResult = calc.subtract(5,3);
		Assert.assertEquals("The result is 2",subtractionResult);
	}

	@Test
		public void multiplicationTest() {
			Calculator calc = new Calculator();
			String multiplyResult = calc.multiply(2,3);
			Assert.assertEquals("The result is 6",multiplyResult);
		}

	@Test
		public void divisionTest() {
			Calculator calc = new Calculator();
			String divideResult = calc.divide(6,3);
			Assert.assertEquals("The result is 2",divideResult);
			String divideResult2 = calc.divide(5,3);
			Assert.assertEquals("The result is 1.66",divideResult2);
			String divideResult3 = calc.divide(6,0);
			Assert.assertEquals("Don't divide by 0, you'll break maths",divideResult3);
		}


}
