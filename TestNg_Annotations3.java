package seleniumprograms;

import org.testng.annotations.Test;

public class TestNg_Annotations3 
{
	
	@Test(priority=-1)//lowest pri will be executed first
	public void registration()
	{
		System.out.println("2nd execution");
	}
	
	@Test//by default priority is 0
	public void login()
	{
		System.out.println("1st execution");
	}

}
