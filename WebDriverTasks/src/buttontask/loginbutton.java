package buttontask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginbutton {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("Admin");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Login successful");
		}else {
			System.out.println("Login Failed");
		}
		
		

	}

}
