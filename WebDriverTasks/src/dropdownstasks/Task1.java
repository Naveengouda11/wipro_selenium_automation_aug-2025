package dropdownstasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();

try {
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	
//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	WebElement nation = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
	nation.click();
	
	WebElement na = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
	na.click();
	
	System.out.println("Nation is : " + na);
	
}catch (Exception e) {
	e.printStackTrace();
}
	}

}
