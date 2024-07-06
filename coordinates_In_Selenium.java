package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class coordinates_In_Selenium 
{
@Test
public void axis_check()
{
	    WebDriver driver = new ChromeDriver();//driver; if import option didn't show
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//coordinates are used to scroll down
		WebElement Aboutus = driver.findElement(By.linkText("About Us"));
		Point p1 = Aboutus.getLocation();//getlocation is method and its rt is point class
		int x = p1.getX();//to get x will give x coordinate of Aboutus, just storing it in var
		int y = p1.getY();//to get x will give y coordinate of Aboutus
		System.out.println(x);
		System.out.println(y);
		//as we are scrolling vertically we are getting the bigger value
}
}
