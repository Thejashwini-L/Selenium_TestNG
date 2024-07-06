package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit_Wait 
{
	ChromeDriver driver;
@Test
public void wait_explicit()
{
	 driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));//1 creating obj of webdriver wait with param
	//w1.until(ExpectedConditions.titleIs("Google"));//2 using the ref var we called until method, ExpectedConditions is cls of selenium,
	//which as so many methods
	w1.until(ExpectedConditions.titleContains("Goo"));
	//w1.until(ExpectedConditions.alertIsPresent());
	//w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	
	WebElement wb = driver.findElement(By.name("q"));
	wb.sendKeys("India");
	wb.sendKeys(Keys.ENTER);
	
}
}
