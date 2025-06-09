package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment21 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		// 1. Launch browser window
		 driver = new EdgeDriver();

		// 2. Maximize the browser window
		driver.manage().window().maximize();

		// 3. Delete all the cookies
		driver.manage().deleteAllCookies();

		// 4. Enter URL and Launch the application
		// (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		// 5. Verify application title

		String actualTitle = driver.getTitle();
		String expectedTitle = "ParaBank | Welcome | Online Banking";

		Assert.assertEquals(actualTitle, expectedTitle, "Title doesnot match");

		// 6. Verify application logo

		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed");

		// 7. Verify application caption

		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String expectedCaption = "Experience the difference";
		String actualCaption = caption.getText();
		Assert.assertEquals(actualCaption, expectedCaption);

		// 8. Enter Invalid credentials in Username and Password textboxes
	
		WebElement usernameTB = driver.findElement(By.xpath("//input[@name='username']"));
		usernameTB.clear();
		usernameTB.sendKeys("bhavitha");
		
		WebElement passwordTB = driver.findElement(By.xpath("//input[@name='password']"));
		passwordTB.clear();
		passwordTB.sendKeys("bhavitha12");

		//9. Click on Login Button
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@value,'Log')]"));
		loginBtn.click();
		
		//10. Verify error message is displayed (The username and password could not be verified.)
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		
//		WebElement errorMsg = driver.findElement(By.xpath("//p[starts-with(text(),'The username')]"));
//		String expectedErrormsg = "The username and password could not be verified.";
//		String actualErrormsg = errorMsg.getText();
//		Assert.assertEquals(actualErrormsg,expectedErrormsg);

		// 11. Click on Adminpage link
	
		WebElement adminPageLink = driver.findElement(By.xpath("//div[@id='headerPanel']//a[@href='admin.htm']"));
		adminPageLink.click();

		// 12. Wait for admin page

		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[@class='title']"), 0));

		// 13. Select Data access mode as ' SOAP'

		SelectDataAccessMode("soap");
		
		// 14. Scrolldown till Loan provider

		WebElement loanProvider = driver.findElement(By.xpath("//select[@id='loanProvider']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", loanProvider);
		
//		15. Select Loanprovider as 'Web Service'
		Select s = new Select (loanProvider);
		s.selectByVisibleText("Web Service");
		
//		16. Click on Submit button
		WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();
		
//		17.wait for Successful submission message
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
		
//		18.Click on Services Link
		WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//li//a[@href='services.htm']"));
		servicesLink.click();
		
//		19.Wait for Services page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		
//		20.Scrolldown till Bookstore services
		WebElement bookStore = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", bookStore);
				
		
//		21.Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='rightPanel']//span[text()='Bookstore services:']/following-sibling::table[1]//tr"));
		int totalRows = rows.size();
		
		List<WebElement> columns = driver.findElements(By.xpath("//div[@id='rightPanel']//span[text()='Bookstore services:']/following-sibling::table[1]//tr[1]//td"));
		int totalColumns = columns.size();
		
//		22.Get Column headers of book store services table
		for(WebElement c : columns) {
			System.out.println(c.getText());
			
		}
		
//		23.Get all the data from book store service table
		for(int r=1; r<=totalRows; r++) {
			for(int c=1; c<=totalColumns; c++) {
				WebElement cell = driver.findElement(By.xpath("//div[@id='rightPanel']//span[text()='Bookstore services:']/following-sibling::table[1]//tr["+r+"]//td["+c+"]"));
				System.out.println("Row "+r+" Column "+c+" value is :" +cell.getText());
			}
		}
		
//		24.Close browser window
		driver.quit();

	}
	
	private static int totalRows(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void quit() {
		// TODO Auto-generated method stub
		
	}

	public static void SelectDataAccessMode(String Option) {
		WebElement DataAccessMode = driver.findElement(By.xpath("//input[@value='"+Option+"']"));
		DataAccessMode.click();
	}

}
