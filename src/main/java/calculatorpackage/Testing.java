package calculatorpackage;

import org.junit.Assert;
import org.junit.Test;

public class Testing {

	@Test
	public void calculatorSubtractionTest(){
		Calculator calc = new Calculator();
		String subtractOutput1 = calc.subtract(10,4);
		String subtractOutput2 = calc.subtract(200,80);
		String subtractOutput3 = calc.subtract(1,-4);
		String subtractOutput4 = calc.subtract(-4,1);
		String subtractOutput5 = calc.subtract(-4,-1);

		Assert.assertEquals("The result is 6", subtractOutput1);
		Assert.assertEquals("The result is 120", subtractOutput2);
		Assert.assertEquals("The result is 5", subtractOutput3);
		Assert.assertEquals("The result is -5", subtractOutput4);
		Assert.assertEquals("The result is -3", subtractOutput5);
	}
	
	@Test
	public void calculatorSubtractionTestDec(){
		Calculator calc = new Calculator();
		String subtractOutput1 = calc.subtractDec(10.5,4.5);
		String subtractOutput2 = calc.subtractDec(200.5,80.5);
		String subtractOutput3 = calc.subtractDec(1.5,-4.5);
		String subtractOutput4 = calc.subtractDec(-4.5,1.5);
		String subtractOutput5 = calc.subtractDec(-4.5,-1.5);

		Assert.assertEquals("The result is 6.0", subtractOutput1);
		Assert.assertEquals("The result is 120.0", subtractOutput2);
		Assert.assertEquals("The result is 6.0", subtractOutput3);
		Assert.assertEquals("The result is -6.0", subtractOutput4);
		Assert.assertEquals("The result is -3.0", subtractOutput5);
	}

}
