package com.globalsqa.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverInit {

	private DriverInit() {
	}

	public static void initDriver() {

		if (DriverManager.getDriver() == null) {
			WebDriver driver = new ChromeDriver();
			DriverManager.setDriver(driver);
			DriverManager.getDriver().manage().window().fullscreen();

		}
	}

}
