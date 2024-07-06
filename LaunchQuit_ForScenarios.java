package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit_ForScenarios
{
	WebDriver driver;
@BeforeMethod()
@Parameters("browsers")

public void login(String nameofthebrowser)
{
	if(nameofthebrowser.equals("Chrome"))
	{
		driver = new ChromeDriver();
	}
	if(nameofthebrowser.equals("Edge"))
	{
		driver = new EdgeDriver();
	}
	if(nameofthebrowser.equals("Firefox"))
	{
		driver = new FirefoxDriver();
	}
}



}
