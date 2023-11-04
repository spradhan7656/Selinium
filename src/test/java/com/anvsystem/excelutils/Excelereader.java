package com.anvsystem.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelereader 
{
	@Test
	public void testreader()
	{
		try {
			FileInputStream fis =new FileInputStream(new File("./data/Testdata.xlsx"));//file object for filereader
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);//pass the file object in the xssf is class that help to open excel
			
			XSSFSheet sheet=wb.getSheet("person");//initilization the sheet
			int lastrow=sheet.getLastRowNum();//This return as the last data present row number
			System.out.println(lastrow);
			for(int i=0;i<=lastrow;i++)
			{
				XSSFRow row=sheet.getRow(i);
				int lastcell=row.getLastCellNum();//This is return as the last data present 
 				for(int j=0;j<lastcell;j++)
				{
					XSSFCell cell=row.getCell(j);
					String data=cell.getStringCellValue();//This is return the cell value
					System.out.print(data+"\t");
				}
				System.out.println("\n");
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
