package tests;

import utilities.PDFUtil;

public class ReadPDF {

	public static void main(String[] args) {
		
		String text = PDFUtil.getPDFText("TestFile.pdf");
		
		//System.out.println(PDFUtil.getPDFText("TestFile.pdf"));
		
		System.out.println(text);

	}

}
