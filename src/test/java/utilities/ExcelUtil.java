package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static List<Map<String, String>> readData(String fileName, String SheetName){
		
		List<Map<String, String>> data = new ArrayList <Map<String, String>>();
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\"+fileName);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sh = wb.getSheet(SheetName);
			
			int totalRows = sh.getPhysicalNumberOfRows();
			int totalColumns = sh.getRow(0).getPhysicalNumberOfCells();
			
			for(int r=1; r<totalRows; r++) {
				
				Map<String, String> rowData = new HashMap <String, String>();
				
				for(int c=0; c<totalColumns; c++) {
					
					String columnName = sh.getRow(0).getCell(c).getStringCellValue();
					
					String columnValue = sh.getRow(r).getCell(c).getStringCellValue();
					
					rowData.put(columnName, columnValue);
					
					
				}
				
				data.add(rowData);
			}
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return data;
		
	}

	
}
