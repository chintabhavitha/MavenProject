package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentExcelUtil {
	
	public static String[][] readData(String fileName, String sheetName){
		
		String[][] data =null;
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\"+fileName);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sh = wb.getSheet(sheetName);
			
			int totalRows = sh.getPhysicalNumberOfRows();
			
			int totalColumns = sh.getRow(0).getPhysicalNumberOfCells();
			
			//create a 2d array to store the data
			
			data = new String[totalRows][totalColumns];
			
			for(int r=0; r<totalRows; r++) {
				
				for(int c=0; c<totalColumns; c++) {
					data[r][c] = sh.getRow(r).getCell(c).getStringCellValue();
				}
			}
					
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

		
		
		
		return data;
		
	}

}
