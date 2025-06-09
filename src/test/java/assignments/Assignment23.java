package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assignment23 {

	public static void main(String[] args) throws IOException {
		
		//1.Launch Chrome Browser
		
		WebDriver driver = new EdgeDriver();
	       
        //2.Maximize the browser window
		driver.manage().window().maximize();
	
		
		//3.Launch the application (https://demoqa.com/alerts)
		driver.get("https://demoqa.com/alerts");
		
		//take the logo screenshot
		WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'Toolsqa')]"));
		webElementScreenshot(logo,"logo_screenshot");
		
		//take the window screenshot
		webdriverScreenshot(driver,"window_screenshot");
		       
		//4.Locate Alert buttons
		WebElement infoAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement timerAlertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		WebElement confirmAlertButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		WebElement promptAlertButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		       
		//5.Launch Information alert
		infoAlert.click();
		
		//wait for alert to be present
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		//Switch to alert and store alert in variable
		
		Alert simpleAlert = driver.switchTo().alert();
		
		       
		//6.Print Alert message
		String alertMessage = simpleAlert.getText();
		System.out.println("Alert Message: "+alertMessage);
		
		  
		//7.Click on OK button
		
		simpleAlert.accept();
		
		//5.Launch timer alert
		
		timerAlertButton.click();
		
		//wait for alert to be present
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		//Switch to alert and store alert in variable
		
		Alert timerAlert = driver.switchTo().alert();
		
		//6.Print Alert message
		String timerAlertMessage = timerAlert.getText();
		System.out.println("Timer Alert Message: "+timerAlertMessage);
		
		//7 click on ok button
		
		timerAlert.accept();
		       
		//8.Launch confirmation alert
		confirmAlertButton.click();
		
		//wait for alert to be present
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		//Switch to alert and store alert in variable
		
		Alert confirmAlert = driver.switchTo().alert();
		
		       
		//9.Print Alert message
		String confirmAlertMessage = confirmAlert.getText();
		System.out.println("ConfirmAlert Message: "+ confirmAlertMessage);
		       
		//10.Click on Cancel button
		confirmAlert.dismiss();
		       
		//11.Launch prompt alert with dialog box alert
		promptAlertButton.click();
		
		//wait for alert to be present
		wait.until(ExpectedConditions.alertIsPresent());
		
		//switch to alert and store alert in variable
		
		Alert promptAlert = driver.switchTo().alert();
		

		//12.Print message
		
		String promptAlertMessage = promptAlert.getText();
		System.out.println("Prompt Alert Message: "+ promptAlertMessage);

		//13.Enter Text in Alert
		promptAlert.sendKeys("Hello, this is selenium");
		       
		//14.Click on OK button
		promptAlert.accept();
		
		
		//15 close the browser
		driver.quit();
	}
	
	public static String webdriverScreenshot(WebDriver driver, String fileName) throws IOException {
		String screenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + fileName+".png";
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(screenshotPath));
		
		
		return screenshotPath;
		
	}
	public static String webElementScreenshot(WebElement element, String fileName) throws IOException {
		String ScreenshotPath = System.getProperty("user.dir")+ "\\Screenshots\\" + fileName + ".png";
		File screenshotFile = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(ScreenshotPath));
		
		return ScreenshotPath;
		
	}

}
