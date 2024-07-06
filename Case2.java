package seleniumprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Case2 {
	@Test
	public static void search()
	{
		//throw new NullPointerException();//to through failure we use this code
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
	    
	    WebElement email_continue = driver.findElement(By.xpath("//input[@id='continue']"));
	    email_continue.click();
	    
	    WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	    pwd.sendKeys("Teju13@1996");
	    
	    WebElement pwd_continue = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	    pwd_continue.click();
	 
	    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
	}
	}
//login and search