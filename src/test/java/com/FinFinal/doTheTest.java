package com.FinFinal;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class doTheTest {
WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dmitry Ognev/Desktop/Java/Selenium/Selenium_files/Drivers/16_1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
