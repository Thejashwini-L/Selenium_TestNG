package seleniumprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assertion_Program 
{
@Test
public void testcase1()
{
	Assert.assertTrue(false);//expecting condition to be true but it is false
	
	Assert.assertFalse(true);////expecting condition to be false but it is true
}
}
