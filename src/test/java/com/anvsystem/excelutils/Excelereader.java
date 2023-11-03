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
			
			XSSFSheet sheet=wb.getSheet("Sheet1");//initilization the sheet
			int lastrow=sheet.getLastRowNum();
			
			for(int i=0;i<=lastrow;i++)
			{
				XSSFRow row=sheet.getRow(i);
				int lastcell=row.getLastCellNum();
				for(int j=0;j<lastcell;j++)
				{
					XSSFCell cell=row.getCell(j);
					String data=cell.getStringCellValue();
					System.out.print(data+"\t");
				}
				System.out.println("\n");
			}
			
			
			System.out.println(lastrow);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
