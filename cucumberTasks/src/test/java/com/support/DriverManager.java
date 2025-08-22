package com.support;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
	public final WebDriver driver;
	
	public DriverManager() {
		ChromeOptions options = new ChromeOptions();
		
		if("true".equalsIgnoreCase(System.getProperty("headless","false"))) {
			options.addArguments("--headless=new");
		}
		
		this.driver = new ChromeDriver(options);
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		this.driver.manage().window().maximize();
	}

}
