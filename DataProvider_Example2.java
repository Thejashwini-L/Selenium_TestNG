package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Example2 {
	@DataProvider(name = "data1") // 3
	public Object[][] method1()// 4 providing the method with obj rt
	{
		Object d1[][] = new Object[5][3];//5
		d1[0][0] = "user1";
		d1[0][1] = "123456789";
		d1[0][2] = "Teju@123";

		d1[1][0] = "user2";
		d1[1][1] = "1234567892";
		d1[1][2] = "Teju@124";

		d1[2][0] = "user3";
		d1[2][1] = "1234567893";
		d1[2][2] = "Teju@125";

		d1[3][0] = "user4";
		d1[3][1] = "1234567894";
		d1[3][2] = "Teju@126";

		d1[4][0] = "user5";
		d1[4][1] = "1234567895";
		d1[4][2] = "Teju@127";
		
		return d1;

	}

	@Test(dataProvider = "data1") // 2 then will mention the dataProvider annotation
	public void amazon_registration(String username, String mobile_no, String password)// 1 will specify the parameters
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement Accountandlists = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(Accountandlists).perform();// target element is AccountandLists on which we hover over
		WebElement signin = driver.findElement(By.xpath("//span[.='Sign in']"));
		signin.click();
		WebElement create_account = driver.findElement(By.id("auth-create-account-link"));
		create_account.click();

		WebElement un = driver.findElement(By.id("ap_customer_name"));
		un.sendKeys(username);
		WebElement phonenum = driver.findElement(By.id("ap_phone_number"));
		phonenum.sendKeys(mobile_no);
		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys(password);
		WebElement verify_mobile = driver.findElement(By.id("continue"));
		verify_mobile.click();
	}

}
