package com.example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webderiverdemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.out.println("Starting");
		driver.get("https://www.calculator.net");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.quit();
		System.out.println("Ending");

	}

}
