package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Cross_Browser_Testing
{
WebDriver driver;
@Test
@Parameters("browser")//as we have mentioned parameters, our test  case is now parameterized
public void google_search(String nameofthebrowser)//will pass the value through xml parameters
{
	if(nameofthebrowser.equals("Edge"))//then execute edge
	{
	driver = new EdgeDriver();
	}
	if(nameofthebrowser.equals("Chrome"))
	{
	driver = new ChromeDriver();
	}
	if(nameofthebrowser.equals("Firefox"))
	{
	driver = new FirefoxDriver();
	}
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement wb = driver.findElement(By.name("q"));
	wb.sendKeys("India");
	wb.sendKeys(Keys.ENTER);
}
}
