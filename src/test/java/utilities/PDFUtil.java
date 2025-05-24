package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFUtil {
	
	public static String getPDFText(String fileName) {
		
		String text = " ";
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\Files\\"+fileName);
			
			PDDocument document = PDDocument.load(fis);
			
			PDFTextStripper pdf = new PDFTextStripper();
			
			pdf.setStartPage(2);
			pdf.setEndPage(2);
			
			text = pdf.getText(document);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return text;
		
		
		
	}

}
