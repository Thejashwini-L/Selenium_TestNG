package seleniumprograms;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_and_Quit_Amazon 
{
//copy the code for login and logout of Amazon
	WebDriver driver;//making the var global so that it can be accessed everywhere , outside the method
	//WebDriver driver;//generic way of launching browser
	@BeforeMethod
	@Parameters("browser")//we are writing this here beac, we are trying for multiple test cases
	//bf testcase1 am, bf testcase2 am
	public void login(String nameofthebrowser)
	{
		if(nameofthebrowser.equals("Edge"))//then execute edge//parallel testing as multiple cls inherit this cls
			//this way we can run parallel testing for multiple test cases
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
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement hoverover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	    ac.moveToElement(hoverover).perform();
	    WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
	    signin.click();
	    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    email.sendKeys("thejashwiniteju13@gmail.com");
	    
	    WebElement email_continue = driver.findElement(By.xpath("//input[@id='continue']"));
	    email_continue.click();
	    
	    WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	    pwd.sendKeys("Teju13@1996");
	    
	    WebElement pwd_continue = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	    pwd_continue.click();
	  
	}
	
	@AfterMethod
	public void quit() throws IOException
	{
		
	TakesScreenshot a1 = (TakesScreenshot) driver;//upcasting driver to TakeScreenshot interface, which ever we want to upcast should be in right side
		File source = a1.getScreenshotAs(OutputType.FILE);//getscreenshot is abs method with para as OutputType.file
		File destination = new File("C:\\Users\\Thejashwini L\\Desktop\\Thejashwini\\ram" + Math.random()+ ".png");
		//creating obj of file class, loc where we want to store along with photo name and extension[png, jpeg, jpg]
		FileHandler.copy(source, destination);
		//add the code for screenshot, so that it will take end result of both the test cases
		//4 lines of code use math.random
		
		//close
		Actions ac = new Actions(driver);
		WebElement hoverover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	    ac.moveToElement(hoverover).perform();
	    WebElement signout = driver.findElement(By.linkText("Sign Out"));
	    signout.click();
	}
}
