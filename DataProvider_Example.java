package seleniumprograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Example
{

    @DataProvider(name= "data1")//2, can be any name
	public Object[][] method1()//DataProvider access specifier can be anything but return type is Object cls of 2 dimension, and any method name
	{
		return new Object[][] {{"Ram"}, {"Lakshman"}, {"shivu"}, {"vishnu"}, {"Kajal"}, {"Ganesh"}}; //the rt of object rt is obj of the obj cls with 2 diemneion, obj cls is root cls of any cls in java
		//new Object[][] -> creating obj
	}
	
    @DataProvider(name= "data2")
    public Object[][] method2()
	{
		return new Object[][] {{11}, {10}, {20}, {70}, {40}, {70}}; 
	}
	
	
	@Test(dataProvider = "data1")
	public void testcase(String name)//1
	{
		System.out.println(name.concat("lord"));
	}
	
	@Test(dataProvider = "data2")
	public void testcase(int rollno)//1
	{
		System.out.println(rollno+100);
	}
}
