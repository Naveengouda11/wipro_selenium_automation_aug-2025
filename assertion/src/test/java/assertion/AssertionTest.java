package assertion;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class AssertionTest {
WebDriver driver = new ChromeDriver();

@Test
	public void testTitle() {
		
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(),"Google");
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
	}
}
