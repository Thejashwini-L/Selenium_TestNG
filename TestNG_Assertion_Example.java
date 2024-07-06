package seleniumprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assertion_Example 
{
@Test
public void testcase1()
{
	//Assert.assertEquals(false, true);//(actual, expected)assertequals without message
	//Assert.assertEquals(true, false, "Sorry conditions not matching");//assertequals with message, msg will not come if test case pass
	//to pass Assert.assertEquals(false, false, "");//expected and actual both are same then test case will pass
	Assert.assertEquals(16, 90);//byte. byte - test case will fail
}
}
