package parametertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {
WebDriver driver;

@Parameters({"url","browser"})
@Test
public void openSite(String url,String browser) {
	System.out.println("Browser : " + browser);
	System.out.println("URL : " + url);
	
	if(browser.equalsIgnoreCase("chrome")) {
	driver = new ChromeDriver();
	
}
	driver.manage().window().maximize();
	driver.get(url);
	driver.quit();

}


}
