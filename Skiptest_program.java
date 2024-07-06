package seleniumprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skiptest_program 
{
@Test
public void Login()
{
	//Assert.assertEquals(false, true);
	Assert.assertTrue(false);
}
@Test(dependsOnMethods = "Login")//parameter added of annotation
public void Logout()
{
	
}
}
