package seleniumprograms;

import org.testng.annotations.Test;

public class TestNg_Annotations4
{
	@Test(priority=1)
	public void registration()
	{
		System.out.println("2nd execution");
	}
	
	@Test(invocationCount=10)
	public void login()
	{
		System.out.println("1st execution");
	}
	
	@Test(priority = 2, invocationCount=2)
	public void login_multipletimes()
	{
		System.out.println("1st execution");
	}
	
	@Test(enabled=false)
	public void logout()
	{
		System.out.println("3rd execution");
	}
}
