package seleniumprograms;

import org.testng.annotations.Test;

public class Grouping_In_TestNG 
{
@Test(groups= {"smoke", "system"})
public void TestCase1()
{
	
}
@Test(groups= {"system"})
public void TestCase2()
{
	
}
@Test(groups= {"smoke"})
public void TestCase3()
{
	
}
@Test(groups= {"system"})
public void TestCase4()
{
	
}
@Test(groups= {"smoke"})
public void TestCase5()
{
	
}
}
