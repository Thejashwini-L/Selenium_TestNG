package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion_AmazonLogin 
{
@Test
public void AmazonLogin()
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	Actions ac = new Actions(driver);
	WebElement hoverover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
    ac.moveToElement(hoverover).perform();
    WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
    signin.click();
    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
    email.sendKeys("thejashwiniteju13@gmail.com");
    
    WebElement email_continue = driver.findElement(By.className("a-button-input"));
    email_continue.click();
    
    WebElement pwd = driver.findElement(By.id("ap_password"));
    pwd.sendKeys("Teju13@1996");
    
    WebElement pwd_continue = driver.findElement(By.id("signInSubmit"));
    pwd_continue.click();
    
    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));//after login, we will get searchtextbox, one of the way to verify login was successfull
   // Assert.assertEquals(search.isDisplayed(), true, "test case failed");//msg will be printed only if assertion fails , expected - false, actual - true - then msg display
    //once we login, verify if the login was successfull using tab name , as tab name will be diff for login page and home page
  Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "sorry");
  Reporter.log("Logged in successfully");
}

}
