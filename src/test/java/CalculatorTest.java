
import calculator.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;
    @Before
    public void setUp(){calculator=new Main();}
	@Test
	    public void test_squareRoot() {
	        double a = 25.0;
	        double expectedResult = 5.0;
	        double result = calculator.squareRoot(a);
	        Assert.assertEquals(expectedResult, result, 0.0f);
	    }
	
	@Test
	    public void test_factorial() {
	        int a = 5;
	        int expectedResult = 120;
	        int result =calculator.factorial(a);
	        Assert.assertEquals(expectedResult, result);
	    }
		
	@Test
	    public void test_naturalLog() {
	        double a = 2.718;
	        double expectedResult = 1.0;
	        double result = calculator.naturalLog(a);
	        Assert.assertEquals(expectedResult, result, 0.2f);
	    }
	
	@Test
	    public void test_power() {
	        double a = 2.0;
			double b = 5.0;
	        double expectedResult = 32.0;
	        double result = calculator.power(a,b);
	        Assert.assertEquals(expectedResult, result, 0.0f);
	    }
	
}
