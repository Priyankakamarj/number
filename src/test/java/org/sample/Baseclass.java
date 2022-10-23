package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	WebDriver driver;
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
    public void enterurl(String url) {
		driver.get(url);
	}
    
    public void elementsendkeysjs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+ data +"')", element);
	}
    public void elementclick(WebElement element) {
		element.click();
	}
    public WebElement findlocatorById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}
    public WebElement findlocatorByName(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}
    public WebElement findlocatorByclassName(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
	}
    public WebElement findlocatorByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
        return element;
	}
    public String getappTitle() {
		String title = driver.getTitle();
		return title;
	}
    public String getappurl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
    public void closeWindow() {
		driver.close();
	}
    public void quitwkndows() {
		driver.quit();
	}
    public String elementgetText(WebElement element) {
		String text = element.getText();;
		return text;
	}
    public void selectOptionByText(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
    public void selectOptionByAttribute(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
    public void selectOptionByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
    public void deselectByText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}
    public void deselectByAttribute(WebElement element,String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}
    public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
    public void explicitwait(WebDriverWait wait,WebElement element,String input) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(input)));
	}
    public void maximizewindows() {
		driver.manage().window().maximize();
	}
    public void insertvalueTextBox(WebElement element, String input) {
		element.sendKeys(input);
	}
    
    public void clickButton(WebElement element) {
		element.click();
	}
    public void OkInAlert() {
		driver.switchTo().alert().accept();
	}
    public void cancelInAlert(Alert alert) {
		alert.dismiss();
	}
   public String getTextFromWebPage(WebElement element) {
	String text = element.getText();
	return text;
    }
   public String InsertedvaluefromTextBox(WebElement element) {
	String attribute = element.getAttribute("value");
	return attribute;
    }
   public void closeallWindows() {
	driver.quit();
    }
   public void closecurrentwindows() {
	driver.close();
    }
   public void insertvalueTextBoxusingjs(WebElement element,String input) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','"+input+"')", element);
    }
   public void clickButtonByjs(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", element);
    }
  public void scrollDownusingjs(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
    }
  public void scrollupusingjs(WebElement element) {
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", element);
    }
   public void launchbrowser() {
	WebDriver driver = new ChromeDriver();
    }
   public void Sysoutput(String name) {
	System.out.println(name);
    }
   public String getDatafromcell(String sheet1,int rownum,int column) throws IOException {
	   String res=" ";
	File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumDay13\\ExcelA\\execl.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet(sheet1);
	Row row = sheet.getRow(rownum);
	Cell cell = row.getCell(column);
	/*String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);*/
	CellType cellType = cell.getCellType();
	switch (cellType) {
	case STRING:
   res = cell.getStringCellValue();
   break;	
	case NUMERIC:
		if(DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
			res = dateformat.format(dateCellValue);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long round = Math.round(numericCellValue);
			
			if(numericCellValue==round) {
				res = String.valueOf(round);
				
				
			} else {
				res= String.valueOf(numericCellValue);
				
			}
										}
		default:
		break;
	}
	return res;
	
}
	
     
}

