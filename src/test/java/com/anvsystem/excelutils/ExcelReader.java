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
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					String data =sheet.getRow(i).getCell(j).getStringCellValue();// extract the excel value to store the value in a string
					
					System.out.print(data+"\t");
				}
				System.out.print(" \n");
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
