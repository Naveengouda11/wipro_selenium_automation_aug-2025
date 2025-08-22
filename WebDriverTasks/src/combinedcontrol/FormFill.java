package combinedcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFill {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input")).sendKeys("Ajay");
		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input")).sendKeys("Deo");
		
		WebElement gender =  driver.findElement(By.xpath("//*[@id=\"sex-0\"]"));
		gender.click();
		Select select = new Select(gender);
	    gender.isSelected();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"exp-2\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("06/02/2002");
		

		driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		

	}

}
