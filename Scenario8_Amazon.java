package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
//launch home page -> in drop down-> search for "power of mind"-> click on 1st product - partially done - should check
public class Scenario8_Amazon //extends LaunchQuit_ForScenarios
{
	@Test
	public void testcase8()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_2otn8yrxsx_e&adgrpid=1326012680603324&hvadid=82876055432358&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=143926&hvtargid=kwd-82876733734104:loc-90&hydadcr=5628_2377283&msclkid=119ced27c1c1186797918b526906f6ea");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement drop_down = driver.findElement(By.id("searchDropdownBox"));
		Select sc= new Select(drop_down);
		sc.selectByVisibleText("Books");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Power of mind");
		search.sendKeys(Keys.ENTER);
		
		//List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
		//autosuggestion.size();
		//autosuggestion.get(1).click();
		
		List<WebElement> first_product = driver.findElements(By.xpath("//div[@class='sg-col-inner']/div/div"));
		first_product.get(0).click();
	}

}
