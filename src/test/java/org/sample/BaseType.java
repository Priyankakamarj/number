package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseType {

	public static void main(String[] args) throws InterruptedException, IOException {
		BaseType b= new BaseType();
		b.booking();
	}
		
	public void booking() throws IOException, InterruptedException {
		
		Baseclass baseclass = new Baseclass();
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		*/
		baseclass.getDriver();
		
		/*driver.get("https://adactinhotelapp.com/");*/
		
		baseclass.enterurl("https://adactinhotelapp.com/");
		/*driver.manage().window().maximize();*/
		baseclass.maximizewindows();
		
		/*WebElement txtlogin = driver.findElement(By.id("username"));
		txtlogin.sendKeys("PriyaRagu");*/
		WebElement textusername = baseclass.findlocatorById("username");
		String name = baseclass.getDatafromcell("Datas", 1, 0);
		baseclass.insertvalueTextBox(textusername,name);
		
		/*WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("jash@123");*/
		WebElement textpassword = baseclass.findlocatorById("password");
		String pass = baseclass.getDatafromcell("Datas", 1, 1);
		baseclass.insertvalueTextBox(textpassword, pass);
		
		/*WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();*/
		WebElement btnlogin = baseclass.findlocatorById("login");
		baseclass.elementclick(btnlogin);
			
		/*WebElement dd = driver.findElement(By.id("location"));
		Select select = new Select(dd);
		select.selectByValue("London");*/
		WebElement location = baseclass.findlocatorById("location");
		String loc = baseclass.getDatafromcell("Datas", 1, 2);
		baseclass.selectOptionByAttribute(location, loc);
		
		/*WebElement DD = driver.findElement(By.id("hotels"));
		Select select1 = new Select(DD);
		select1.selectByValue("Hotel Creek");*/
		WebElement hotels = baseclass.findlocatorById("hotels");
		String hotel = baseclass.getDatafromcell("Datas", 1, 3);
		baseclass.selectOptionByAttribute(hotels, hotel);
		
		/*WebElement room = driver.findElement(By.id("room_type"));
		Select select2 = new Select(room);
		select2.selectByValue("Super Deluxe");*/
		WebElement Room = baseclass.findlocatorById("room_type");
		String roomType = baseclass.getDatafromcell("Datas", 1, 4);
		baseclass.selectOptionByAttribute(Room, roomType);
		
		/*WebElement nos = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(nos);
		select3.selectByValue("6");*/
		WebElement RoomNo = baseclass.findlocatorById("room_nos");
		String roomno = baseclass.getDatafromcell("Datas", 1, 5);
		baseclass.selectOptionByAttribute(RoomNo, roomno);
		
		/*WebElement adult = driver.findElement(By.id("adult_room"));
		Select select4 = new Select(adult);
		select4.selectByValue("2");*/
		WebElement Adultroom = baseclass.findlocatorById("adult_room");
		String Aroom = baseclass.getDatafromcell("Datas", 1, 8);
		baseclass.selectOptionByAttribute(Adultroom, Aroom);
		
		/*WebElement child = driver.findElement(By.id("child_room"));
		Select select5 = new Select(child);
		select5.selectByValue("1");*/
		
		WebElement childRoom = baseclass.findlocatorById("child_room");
		String croom = baseclass.getDatafromcell("Datas", 1, 9);
		baseclass.selectOptionByAttribute(childRoom, croom);
		
		/*WebElement btnsearch = driver.findElement(By.id("Submit"));
		btnsearch.click();*/
		
		WebElement submit = baseclass.findlocatorById("submit");
		baseclass.elementclick(submit);
		
		/*WebElement btnselect = driver.findElement(By.id("radiobutton_0"));
		btnselect.click();*/
		WebElement radiobutton = baseclass.findlocatorById("radiobutton_0");
		baseclass.elementclick(radiobutton);
		
		/*WebElement btncont = driver.findElement(By.id("continue"));
		btncont.click();*/
		WebElement con = baseclass.findlocatorById("continue");
		baseclass.elementclick(con);
		
		/*WebElement Firstname = driver.findElement(By.id("first_name"));
		Firstname.sendKeys("Priya");*/
		WebElement fname = baseclass.findlocatorById("first_name");
		String firname = baseclass.getDatafromcell("Datas", 1, 10);
		baseclass.insertvalueTextBox(fname, firname);
		
		/*WebElement Lastname = driver.findElement(By.id("last_name"));
		Lastname.sendKeys("K");*/
		WebElement lname = baseclass.findlocatorById("last_name");
		String laname = baseclass.getDatafromcell("Datas", 1, 11);
		baseclass.insertvalueTextBox(lname, laname);
		
		/*WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("No.43 srinivasa Nagar");*/
		WebElement Add = baseclass.findlocatorById("address");
		String Address = baseclass.getDatafromcell("Datas", 1, 12);
		baseclass.insertvalueTextBox(Add, Address);
		
		/*WebElement Card = driver.findElement(By.id("cc_num"));
		Card.sendKeys("1234567890287654");*/
		WebElement cc = baseclass.findlocatorById("cc_num");
		String ccnum = baseclass.getDatafromcell("Datas", 1, 13);
		baseclass.insertvalueTextBox(cc, ccnum);
		
		/*WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select select7 = new Select(cardtype);
		select7.selectByValue("VISA");*/
		WebElement ccT = baseclass.findlocatorById("cc_type");
		String cctype = baseclass.getDatafromcell("Datas", 1, 14);
		baseclass.insertvalueTextBox(ccT, cctype);
		
		/*WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select select8 = new Select(month);
		select8.selectByValue("1");*/
		WebElement ccM = baseclass.findlocatorById("cc_exp_month");
		String expmonth = baseclass.getDatafromcell("Datas", 1, 15);
		baseclass.insertvalueTextBox(ccM, expmonth);
		
		/*WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select select9 = new Select(year);
		select9.selectByValue("2022");*/
		WebElement ccY = baseclass.findlocatorById("cc_exp_year");
		String expyear = baseclass.getDatafromcell("Datas", 1, 16);
		baseclass.insertvalueTextBox(ccY, expyear);
		
		/*WebElement CVV = driver.findElement(By.id("cc_cvv"));
		CVV.sendKeys("333");*/
		WebElement cccv = baseclass.findlocatorById("cc_cvv");
		String cccvv = baseclass.getDatafromcell("Datas", 1, 17);
		baseclass.insertvalueTextBox(cccv, cccvv);
		
		/*WebElement submit = driver.findElement(By.id("book_now"));
		submit.click();*/
		WebElement booknow = baseclass.findlocatorById("book_now");
	    baseclass.elementclick(booknow);
		
		Thread.sleep(30000);
		/*WebElement txtOrderNo = driver.findElement(By.id("order_no"));
		String attribute = txtOrderNo.getAttribute("value");
		System.out.println(attribute);*/
		WebElement orderno = baseclass.findlocatorById("order_no");
		//String insertedvaluefromTextBox = baseclass.InsertedvaluefromTextBox(orderno);
	//	baseclass.Sysoutput(insertedvaluefromTextBox);
		System.out.println(orderno);

	}
}

