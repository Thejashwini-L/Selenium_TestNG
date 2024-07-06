package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait 
{
	@Test
	public void amazon_search()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//got loaded in 1sec
	//9 sec will be saved and it will not be wasted 9 sec of time
	//loaded in 4 sec
	//6 sec
	//webpage is not loaded even after 10 sec, we get exception NoSuch Element 
	//implicit wait code written once will be applicable throughout the pgm
	//IW is aplicable only for find element and findelements methods not for any other
	//IW code should be written as soon as we launch the browser
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.findElement(By.name("field-keywords")).sendKeys("shoes");
	driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
	}
}
