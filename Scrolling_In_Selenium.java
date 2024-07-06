package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolling_In_Selenium 
{
	//In Amazon home page scroll down till About us
	@Test
	public void axis_check()
	{
		    ChromeDriver driver = new ChromeDriver();//driver; if import option didn't show
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			
			//coordinates are used to scroll down
			WebElement aboutus = driver.findElement(By.linkText("About Us"));
			Point p1 = aboutus.getLocation();//getlocation is method and its rt is point class
			
			int x = p1.getX();//to get x will give x coordinate of Aboutus, just storing it in var
			int y = p1.getY();//to get x will give y coordinate of Aboutus
			System.out.println(x);
			System.out.println(y);
			//as we are scrolling vertically we are getting the bigger value
			
			JavascriptExecutor e1 = driver;//upcasting driver to JavascriptExecutor
			//e1.executeScript("window.scrollBy(0, 500)");// 0 - x, y-500 without using getx and gety - the scroll will be moved bit down
			//e1.executeScript("window.scrollBy(0, -500)");//moved up again
			e1.executeScript("window.scrollBy(0, "+y+")");
			
			
	}

}
