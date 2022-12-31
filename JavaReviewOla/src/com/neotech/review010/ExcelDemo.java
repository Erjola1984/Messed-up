package com.neotech.review010;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDemo {

	public static void main(String[] args) throws IOException   {
		String fullPath = System.getProperty("user.dir") + "/Extra/Excel.xlsx";
		
		FileInputStream fis =new FileInputStream(fullPath);
		
		//Read the whole excel file
		Workbook book = new XSSFWorkbook(fis);
		
		//get the sheet from the excel file
		Sheet sheet = book.getSheet("Sheet1");
		
		//get the row (with index 2) from the sheet
		Row row2 = sheet.getRow(2);
		
		//get the cell(with index 0) from the row
		Cell cell0 = row2.getCell(0);
		
		//printing the information of the cell
		System.out.println(cell0.toString());
	}

}
