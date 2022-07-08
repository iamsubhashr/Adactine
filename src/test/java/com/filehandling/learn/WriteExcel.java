package com.filehandling.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\filehandling\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		//workbook
		Workbook wb = new XSSFWorkbook();
		Sheet createSheet = wb.createSheet("StudentData");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Username");
		
		wb.getSheet("studentData").createRow(1);
		wb.getSheet("studentData").createRow(2);
		
		wb.getSheet("studentData").getRow(1).createCell(0).setCellValue("subhash");
		wb.getSheet("studentData").getRow(2).createCell(0).setCellValue("suresh");
	
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		System.out.println("Wrote to file sucessfully");
		wb.close();
	}
}
