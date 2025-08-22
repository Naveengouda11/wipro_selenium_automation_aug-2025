package inputboxtask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_forms.asp ");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.clear();
		
		WebElement lname  = driver.findElement(By.id("lname"));
		lname.clear();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement fname1 = driver.findElement(By.id("fname"));
		fname1.sendKeys("Navi");
		
		WebElement lname1 = driver.findElement(By.id("lname"));
		lname1.sendKeys("Patil");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/form/input[3]"));
		submit.click();
		

	}

}
