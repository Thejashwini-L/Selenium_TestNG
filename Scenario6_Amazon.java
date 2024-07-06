package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//After launch -> click on Electronins major tab-> select the brand "redmi"
public class Scenario6_Amazon extends LaunchQuit_ForScenarios
{
	@Test
	public void testcase6()
	{
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_2otn8yrxsx_e&adgrpid=1326012680603324&hvadid=82876055432358&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=143926&hvtargid=kwd-82876733734104:loc-90&hydadcr=5628_2377283&msclkid=119ced27c1c1186797918b526906f6ea");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		List<WebElement> Electronic_majortab = driver.findElements(By.xpath("//div[@id='nav-xshop-container']/div/a"));
		Electronic_majortab.get(7).click();
		
		WebElement redmi = driver.findElement(By.id("sobe_d_b_20_6"));
		redmi.click();
	}
	
}
