package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//Search shoe, click on first shoe
public class Sceanrio1_Amazon  extends LaunchQuit_ForScenarios
{
@Test
public void testcase1()
{
	driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_2otn8yrxsx_e&adgrpid=1326012680603324&hvadid=82876055432358&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=143926&hvtargid=kwd-82876733734104:loc-90&hydadcr=5628_2377283&msclkid=119ced27c1c1186797918b526906f6ea");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Shoes");
	search.sendKeys(Keys.ENTER);
	
	List<WebElement> first_shoe = driver.findElements(By.xpath("//a[@class = 'a-link-normal s-no-outline']/div"));
	first_shoe.get(0).click();
}
}
