package seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Soft_Hard_Assertion_Example 
{
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();//headless browser testing
		options.addArguments("--headless");////headless browser testing, browser will not launch, we bave for other browsers as well
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("field-keywords")).sendKeys("shoes");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
		
		Set<String> s1 = driver.getWindowHandles();
		
		Assertion a1 = new Assertion();//hard assert
		a1.assertEquals(s1.size(), 2);//hard assert
		
		SoftAssert s2 =  new SoftAssert();//softassert
		s2.assertEquals(s1.size(), 2);//softassert
		
		
		
	}

}
