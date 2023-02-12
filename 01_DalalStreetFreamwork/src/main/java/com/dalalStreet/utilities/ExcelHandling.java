package com.dalalStreet.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling 
{
	String path = System.getProperty("user.dir")+"\\src\\resource\\java\\TestData\\DalalStreetTestData.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFRow row;
	XSSFCell cell;
	String data;
	XSSFSheet sheet;
	
//==================================================================================
//	public static void main(String[] args) 
//	{
//		ExcelHandling obj = new ExcelHandling();
//		System.out.println(obj.readData("Login", 4, 1));
//		System.out.println(obj.getRowNumber("Login"));
//		System.out.println(obj.getCellNumber("Login", 1));
//		obj.writeData("Login", 4, 3, "DONEEEEE");
//	}
	
//==================================================================================
	
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

//Write Data in Excel Sheet ==> ressult in the form of Passed And Failed 

	public void writeData(String sheet_name, int row_index, int cell_index, String status)
	{
		try
		{
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			row = wb.getSheet(sheet_name).getRow(row_index); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		row.createCell(cell_index).setCellValue(status);
		try 
		{
			fos = new FileOutputStream(file);
			wb.write(fos);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}	
	}
}
