package com.anvsystem.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	public static void main(String[] args) 
	{
		try {
			FileInputStream fis =new FileInputStream(new File("./data/Testdata.xlsx"));//file object for filereader
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);//pass the file object in the xssf is class that help to open excel
			
			XSSFSheet sheet=wb.getSheet("Sheet1");//initilization the sheet
			String data =sheet.getRow(1).getCell(2).getStringCellValue();// extract the excel value to store the value in a string
			
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
