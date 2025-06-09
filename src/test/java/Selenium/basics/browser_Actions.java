package Selenium.basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class browser_Actions {

	public static void main(String[] args) {
		
		
//		Selenium supports headless cant be seen peforming actions
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		//to minimise and maximise the window
		
		driver.manage().window().minimize();
		
		driver.manage().window().setSize(new Dimension(430, 932));
		
		driver.manage().window().maximize();
		
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().getCookies();
		//System.out.println(driver.manage().getCookies());
		//to get the title
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Selenium";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com");
		
		driver.switchTo().window(mainwindow);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.co.in");
		
		driver.switchTo().window(mainwindow);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		System.out.println("the size of the window is :" + width + "x" + height);
		
		driver.close();
		
		driver.quit();
		
		
		
		
		

		
		
		

	}

}
