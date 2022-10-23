package org.session;

import java.io.File;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session1 {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumDay13\\ExcelA\\TestData1.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.getSheet("Hexa");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");

	}

}
