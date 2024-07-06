package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait_1 
{
	@Test
	public void num_links()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	//to find no. of links present in page
	List<WebElement> links = driver.findElements(By.tagName("a"));//finding the no of links present in page, as all the links tagname is common and
	//its a, so we inspected with tagname=a
    int count = links.size();
    System.out.println(count);
    
    //to print the each link present in page
    for(int i=0;i<count;i++)//i=0 because get(i) works on index
    {
    	WebElement s1 = links.get(i);//get the link acc to index, rt of get method is WebElement
    	String linktoprint = s1.getAttribute("href");//get attribute is present only in WebElemet not in List<WebElement>, gives the value present
    	//at given attribute href, and rt is string
    	
    	String linktext = s1.getText();//get us the link text value of all the links, also we can see some empty space 
    	//in that case there is no link text msg for some links
    	System.out.println(linktext);
    	System.out.println(linktoprint);
    }
    
    //to print the link text
    
}
}
