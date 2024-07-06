package seleniumprograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Annotations2 
{
	@Test
	public static void testcase1()
	{
		System.out.println("testcase1");
	}
	@Test
	public static void testcase2()
	{
		System.out.println("testcase2");
	}
	@Test
	public static void testcase3()
	{
		System.out.println("testcase3");
	}
	
	@BeforeMethod
	public static void bm()
	{
		System.out.println("Browser launch");
	}
	@AfterMethod
	public static void am()
	{
		System.out.println("Browser close");
	}

}
