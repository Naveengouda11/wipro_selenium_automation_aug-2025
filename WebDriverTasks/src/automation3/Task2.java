package automation3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		
		Alert confirmAlt = driver.switchTo().alert();
		
		System.out.println("Confirm Alter Text : " + confirmAlt.getText());
		
		confirmAlt.dismiss();
		
		String resTxt = driver.findElement(By.id("result")).getText();
		System.out.println("Result on page : " + resTxt);
		
		if(resTxt.equals("You clicked: Cancle")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		Thread.sleep(2000);

	}

}
