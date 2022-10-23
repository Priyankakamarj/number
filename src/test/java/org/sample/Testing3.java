package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing3 {
	@Test
	private void app() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		driver.findElement(By.name("identifier")).sendKeys("Priyankapnr789@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}

}
