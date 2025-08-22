package crossbrowser;

import java.awt.GridBagConstraints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
		System.out.println("Title on : " + driver.getTitle());
	}
}
