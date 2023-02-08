package com.dalalStreet.utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling 
{
	String path = "C:\\Users\\Dnyaneshwar\\eclipse-workspace\\0001_DalalStreetFreamwork\\src\\test\\resource\\TestData\\DalalStreetTestData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFCell cell;
	String data;
	XSSFSheet sheet;
	
// DataFormatter class used to get all types of data(Sting, numeric, date) 
	
	public String readData(String sheet_name, int row_index, int cell_index)
	{
		try
		{
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			cell = wb.getSheet(sheet_name).getRow(row_index).getCell(cell_index);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		DataFormatter formate = new DataFormatter();
		data = formate.formatCellValue(cell);
		
		return data;
	}
	
//=====================================================================================
//get total number of rown in excel sheet
	
	public int getRowNumber(String sheet_name)
	{
		try
		{
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheet_name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int total_rows = sheet.getLastRowNum();
		return total_rows;
	}
	
//====================================================================================
//get total number of rown in excel sheet

	public int getCellNumber(String sheet_name, int row_index)
	{
		try
		{
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheet_name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int total_cell = sheet.getRow(row_index).getLastCellNum();
		return total_cell;
	}
//====================================================================================
}
