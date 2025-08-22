package buttontask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchbutton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com ");
		
		WebElement ser = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		ser.sendKeys("Selenium WebDriver");
		
		ser.submit();

	}

}
