package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assertion_Example2 
{
@Test
public void testcase_assertion()
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.name("q"));
    search.sendKeys("India");
    search.sendKeys(Keys.ENTER);
    
    Assert.assertEquals(driver.getTitle(), "India - Google Search", "Sorry");//expected should always be hand writen, actual should come 
    //from predefined methods
    
}
}
