package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import statements
public class ReadExcelData {
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream ip =  new FileInputStream("C:\\Users\\jayud\\OneDrive\\Desktop\\MyProjects\\UserDetails.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);		
		XSSFSheet sh = wb.getSheet("Users");
		
		XSSFRow row = sh.getRow(1);
		XSSFCell cell = row.getCell(1);
		
		System.out.println(row.getLastCellNum());
		
		for(int r=0; r<row.getLastCellNum(); r++)
		{
			for(int c=0; c<row.getLastCellNum(); c++)
			{
				System.out.println(cell.getStringCellValue());

			}
		}	

	}
}
