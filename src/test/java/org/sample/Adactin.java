package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Adactin {

	public static void main(String[] args) throws IOException {
		  //Metion the path of excel
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumDay13\\ExcelA\\TestData1.xlsx");
		  //Get the object/ Byes from file -->File Inutstream
		FileInputStream stream = new FileInputStream(file);
		//create the WORKBOOK ->collect the sheet
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Datas");
		//  Iterate all row
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.print(cell+"\t");
			}
			System.out.println();
		}
		
		

	}
}
