package Testing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import calculatorpackage.Calculator;
import calculatorpackage.Division;


public class divideTest {
double n1=5;
double n2=3;
	@Test
	public void divideTest() {
		Division calc = new Division();
		String divideResult = calc.division(6,3);
		Assert.assertEquals("The result is 2.0",divideResult);
		String divideResult2 = calc.division(5,3);
		Assert.assertEquals("The result is " + (n1/n2) ,divideResult2);
		String divideResult3 = calc.division(6,0);
		Assert.assertEquals("The result is Infinity",divideResult3);
	}

}
