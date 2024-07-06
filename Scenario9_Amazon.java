package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//launch home page-> click on today's deal-> click deal of the day-> click on first product
public class Scenario9_Amazon
{
@Test
public void testcase9()
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_2otn8yrxsx_e&adgrpid=1326012680603324&hvadid=82876055432358&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=143926&hvtargid=kwd-82876733734104:loc-90&hydadcr=5628_2377283&msclkid=119ced27c1c1186797918b526906f6ea");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	List<WebElement> TodaysDeal_majortab = driver.findElements(By.xpath("//div[@id='nav-xshop-container']/div/a"));
	TodaysDeal_majortab.get(5).click();
	
	List<WebElement> DealofTheDay = driver.findElements(By.xpath("//div[@id='anonCarousel1']/ol/li"));
	DealofTheDay.get(1).click();
	
	List<WebElement> FirstProduct = driver.findElements(By.xpath("//div[@class='a-section a-spacing-mini']/div/div"));
	FirstProduct.get(0).click();
	
}

}
