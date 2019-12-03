package calculatorpackage;

import org.junit.Assert;
import org.junit.Test;

public class MultiplierTest {
	
	@Test
	public void multiplicationTest() {
		Multiplier multiply = new Multiplier();
		String multiplyResult = multiply.calculate(2,3);
		Assert.assertEquals("The result is 6", multiplyResult);
	}

}
