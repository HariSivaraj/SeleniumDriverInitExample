package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Login {

	@Test
	public void loginApp() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		System.out.println("this is example for git");
	}

}