package com.groupten.excellibClass;

import java.io.*;
import org.apache.poi.ss.usermodel.*;

public class ExcelLibrary {
	
	public String getExcelData(String xlPath, String sheetName, int row,int cell) {
		String retVal = null;
		try {
			FileInputStream fis = new FileInputStream(xlPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row r = sh.getRow(row);
			Cell cel = r.getCell(cell);
			retVal = cel.getStringCellValue();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}

	public void setExcelData(String xlPath, String sheetName, int row,
			int cell, String data) {
		try {
			FileInputStream fis = new FileInputStream(xlPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row r = sh.getRow(row);
			Cell cel = r.getCell(cell);
			r.createCell(cell);
			FileOutputStream fos = new FileOutputStream(xlPath);
			cel.setCellValue(data);
			wb.write(fos);
			wb.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getRowCount(String xlPath, String sheetName) {

		int rc = 0;
		try {
			FileInputStream fis = new FileInputStream(xlPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			rc = sh.getLastRowNum();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		return rc;
	}

}
