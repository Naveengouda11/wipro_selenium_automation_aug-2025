package inputboxtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfieldtask {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_forms.asp");
		
		WebElement uname = driver.findElement(By.id("fname"));
		uname.sendKeys("Navi");
		
		WebElement pass = driver.findElement(By.id("lname"));
		pass.sendKeys("patil");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/form/input[3]"));
		submit.click();

	}

}
