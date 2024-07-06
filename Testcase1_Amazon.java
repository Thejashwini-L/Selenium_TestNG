package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase1_Amazon extends Launch_and_Quit_Amazon
{
	@Test
	public void first_product()
	{
		WebElement search = driver.findElement(By.name("field-keywords"));
		search.sendKeys("shoes");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);

		List<WebElement> frstshoe = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']/div"));
		frstshoe.get(0).click();
		
	}
//login->searching->click on 1st product->logout
}
