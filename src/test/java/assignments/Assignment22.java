package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment22 {

	static WebDriver driver;

	public static void main(String[] args) {

		// 1. Launch browser window(Chrome)

		// driver = new ChromeDriver();
		driver = new EdgeDriver();

		// 2. Maximize the browser window

		driver.manage().window().maximize();

		// 3. Delete all the cookies
		driver.manage().deleteAllCookies();

		// 4. Enter URL and Launch the application
		// (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");

		// 5. Wait for Page-load

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//input[@id='firstName']"), 0));

		// 6. Enter First name and Last name

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Bhavitha");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("chinta");

		// 7. Enter Email

		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("chinta@gmail.com");

		// 8. Select Gender (Female)
		selectGender("Female");

		// 9. Enter mobile number

		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("1234567891");

		// 10.Select DOB (24-oct-2005)

		selectDOB("24", "October", "2005");

		// 11.Search and Select Computer Science
		selectSubject("Computer Science");

		// 12.Select Hobbies as Sports and Reading

		String[] hobbies = { "Sports", "Reading" };
		selectHobbies(hobbies);

		// 13.Upload photo

		String filePath = System.getProperty("user.dir") + "\\Files\\photo.png";
		WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadButton.sendKeys(filePath);

		// 14 Select the state
		selectState("Haryana");

		// select the city
		selectCity("Karnal");

		// 15.wait and click Submit Button
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitButton);

		// 16close the popup

		WebElement close = driver.findElement(By.xpath("//button[@id='closeLargeModal']"));
		close.click();

		// 16. Close browser window
		driver.quit();

	}

	public static void selectGender(String Option) {
		WebElement gender = driver.findElement(By.xpath("//label[text()='" + Option + "']"));
		gender.click();
	}

	public static void selectDOB(String Date, String Month, String Year) {

		// To click on the DOB input
		WebElement dobInput = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dobInput.click();

		// wait and select the month

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[@class='react-datepicker__month-select']")));

		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select m = new Select(monthDropdown);
		m.selectByVisibleText(Month);

		// to select the year

		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));

		Select y = new Select(yearDropdown);
		y.selectByVisibleText(Year);

		// To select the date

		WebElement dateElement = driver
				.findElement(By.xpath("//div[contains(@aria-label,'" + Month + "') and text()='" + Date + "']"));
		dateElement.click();

	}

	public static void selectSubject(String subject) {
		WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));

		// scroll till the subject input field

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subjectInput);

		// Enter the subject in the input field

		Actions action = new Actions(driver);
		action.sendKeys(subjectInput, subject).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[text()='Computer Science' and contains(@class,'option')]")));

		WebElement subjectOption = driver
				.findElement(By.xpath("//div[text()='" + subject + "' and contains(@class,'option')]"));
		subjectOption.click();
	}

	public static void selectHobbies(String[] hobbies) {
		for (String hobby : hobbies) {
			WebElement hobbyCheckbox = driver.findElement(By.xpath("//label[text()='" + hobby + "']"));
			if (!hobbyCheckbox.isSelected()) {
				hobbyCheckbox.click();
			}

		}
	}

	public static void selectState(String State) {
		WebElement stateInput = driver.findElement(By.xpath("//div[@id='state']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", stateInput);
		stateInput.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+State+"' and contains(@class,'option')]")));
		
		WebElement stateOption = driver.findElement(By.xpath("//div[text()='"+State+"' and contains(@class,'option')]"));
		stateOption.click();
	

	}

	public static void selectCity(String City) {
		WebElement cityInput = driver.findElement(By.xpath("//div[@id='city']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", cityInput);
		cityInput.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+City+"' and contains(@class,'option')]")));
		
		WebElement cityOption = driver.findElement(By.xpath("//div[text()='"+City+"' and contains(@class,'option')]"));
		cityOption.click();
		


	}
}
