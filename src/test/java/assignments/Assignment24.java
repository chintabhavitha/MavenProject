package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment24 {

	public static void main(String[] args) {
		
// 		1.Launch Chrome Browser
		WebDriver driver = new EdgeDriver();
		       
//		2.Maximize the browser window
		driver.manage().window().maximize();
		       
//		3.Launch the application (https://demoqa.com/frames)
		driver.get("https://demoqa.com/frames");
		        
//		4.Locate elements
		WebElement mainWindowElement = driver.findElement(By.xpath("//h1[text()='Frames']"));
		
		//switch to the frame from the window
		driver.switchTo().frame("frame1");
		
//		5.Print frame element text
		WebElement frameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		
		//print the text from the element
		String frameText = frameElement.getText();
		System.out.println("Frame Text: "+frameText);
		           
//		6.Print main window element text
		driver.switchTo().defaultContent();
		
		//print the text from main window element
		String mainWindowText = mainWindowElement.getText();
		System.out.println("Main window Text: "+mainWindowText);
		       
//		7.Close browser window
		driver.quit();
		System.out.println("Browser closed successfully");

	}

}
