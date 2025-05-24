package tests;

import utilities.AssignmentExcelUtil;

public class AssignmentReadExcel {

	public static void main(String[] args) {
		
		String [][] data = AssignmentExcelUtil.readData("AssignmentTestData.xlsx", "StudentDetails");
		
		System.out.println(data);
	}

}
