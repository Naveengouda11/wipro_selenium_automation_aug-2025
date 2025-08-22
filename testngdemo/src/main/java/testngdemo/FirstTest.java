package testngdemo;

import java.time.Duration;
import java.util.logging.LogManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.api.logs.Logger;


public class FirstTest {
	
	WebDriver driver;
	String res;


	@BeforeTest
	public void init() {
		
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}

	@Test
	public void apptest() {
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		res = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
	}
	@AfterTest
	public void testDown() {
		System.out.println("Result is : " + res);
		if(res.trim().equals("10")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		driver.quit();
		System.out.println("Brower Closed");
	}

	}



