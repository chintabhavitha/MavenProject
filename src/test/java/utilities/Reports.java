package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	// Initialise all classes

	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public static ExtentTest logger;

	public static void setupReport(String fileName) {
		html = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\Reports\\"+fileName+".html");
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	public static void startReporting(String testName) {
		logger = extent.createTest(testName);
	}

	public static void stopReporting() {
		extent.flush();
	}

}
