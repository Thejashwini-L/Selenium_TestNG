package seleniumprograms;

import java.io.File;
import java.io.IOException;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider_AmazonLogin {
	@DataProvider(name = "login details")
	public Object[][] username() {
		Object d1[][] = new Object[5][2];// created an obj of obj cls with ref var//bec we are giving 5 set of values,
											// un and pwd
		// this is first set of data for student
		d1[0][0] = "stud@gmail.com";
		d1[0][1] = "Abc@123";
		// this is sec set of data for mohan
		d1[1][0] = "mohan@gmail.com";
		d1[1][1] = "Efg@456";
		// this is third set of data for pavan
		d1[2][0] = "pavan@gmail.com";
		d1[2][1] = "com@123";
		// this is fourth set of data for charan
		d1[3][0] = "charan@gmail.com";
		d1[3][1] = "math@999";
		// this is fifth set of data for karan
		d1[4][0] = "karan@gmail.com";
		d1[4][1] = "Adc@666";
		
		return d1;//when ever the rt is non void then we should have return, return ref d1
	}

	@Test(dataProvider = "login details")
	public void login(String un, String pwd) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		Actions ac = new Actions(driver);
		WebElement hoverover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		ac.moveToElement(hoverover).perform();
		WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(un);

		WebElement email_continue = driver.findElement(By.xpath("//input[@id='continue']"));
		email_continue.click();

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(pwd);

		WebElement pwd_continue = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		pwd_continue.click();

	}

}
