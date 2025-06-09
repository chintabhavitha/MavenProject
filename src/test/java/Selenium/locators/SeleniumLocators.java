package Selenium.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumLocators {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		WebElement element = driver.findElement(By.className("logo"));
		System.out.println(element);
		
		WebElement actualCaption = driver.findElement(By.className("caption"));
		//String expectedCaption = "Experience the difference";
		
		//Assert.assertEquals(actualCaption, expectedCaption);
		
		System.out.println(actualCaption);
		
		WebElement element1 = driver.findElement(By.cssSelector("li[class='Solutions']"));
		System.out.println(element1);
		
		WebElement element2 = driver.findElement(By.cssSelector("div[id = 'headerPanel'] > ul[class='leftmenu'] > li:nth-child(2) > a"));
		System.out.println(element2);
		
		//div[id='headerPanel'] > ul[class='leftmenu'] > li > a[href='about.htm']
		//div[id = 'headerPanel'] > ul[class='leftmenu'] > li:nth-child(2) > a
		
		WebElement element3 = driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(3) >a "));
		System.out.println(element3);
		
		WebElement element4 = driver.findElement(By.cssSelector("div[id = 'headerPanel'] > ul[class='leftmenu'] > li:nth-child(4) >a "));
		System.out.println(element4);
		
		driver.findElement(By.cssSelector("div#headerPanel > ul[Class='leftmenu'] > li:nth-child(5) > a")); //Locations
		driver.findElement(By.cssSelector("div#headerPanel > ul[Class='leftmenu'] > li:nth-child(6) > a")); //Admin Page
		driver.findElement(By.cssSelector("div[id ='headerPanel'] > ul[Class='button'] > li > a")); //home
		driver.findElement(By.cssSelector("div[id ='headerPanel'] > ul[Class='button'] > li:nth-child(2) > a")); //about
		driver.findElement(By.cssSelector("div[id ='headerPanel'] > ul[Class='button'] > li > a[href='contact.htm']")); //contact
		driver.findElement(By.cssSelector("div[id ='leftPanel'] > h2")); //customer login
		driver.findElement(By.cssSelector("form[name='login'] > p:nth-child(1) > b")); //username
		driver.findElement(By.cssSelector("input[name='username']")); //username text box
		driver.findElement(By.cssSelector("div#loginPanel > form[name='login'] > p:nth-child(3) >b ")); //password 
		driver.findElement(By.cssSelector("input[name='password']")); //password text box
		driver.findElement(By.cssSelector(" input[value ='Log In']")); //login button
		driver.findElement(By.cssSelector("a[href='lookup.htm']")); //forgot login info
		driver.findElement(By.cssSelector("a[href='register.htm']")); //Register
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(1)")); //ATM services
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(2) >a")); //withdraw funds
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(3) >a")); //transfer funds
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(4) >a")); //check balances
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(5) >a")); //Make deposits
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(1)")); //online services
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(2) > a")); //bill pay
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(3) > a")); //account history
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(4) > a")); //Transfer funds
		driver.findElement(By.cssSelector(" p[class ='more'] > a[href='services.htm']")); //Read More
		driver.findElement(By.cssSelector("ul[class='events'] > li:nth-child(1)")); //date
		driver.findElement(By.cssSelector("ul[class='events'] > li >a[href='news.htm#6]")); //parabank is now reopened
		driver.findElement(By.cssSelector("ul[class='events'] > li > a[href='news.htm#5']")); //new ! online bill pay
		driver.findElement(By.cssSelector("ul[class='events'] > li > a[href='news.htm#4']")); //new ! online Account transfers
		driver.findElement(By.cssSelector(" a[href='news.htm']")); //Read more
		driver.findElement(By.cssSelector("div#footerPanel> ul> li> a[href='index.htm']")); //home--footer
		driver.findElement(By.cssSelector(" div#footerPanel> ul> li> a[href='about.htm']")); //about us--footer
		driver.findElement(By.cssSelector("div#footerPanel> ul> li> a[href='services.htm']")); //services--footer
		driver.findElement(By.cssSelector("div#footerPanel> ul> li:nth-child(4) > a")); //products--footer
		driver.findElement(By.cssSelector("div#footerPanel> ul> li:nth-child(5) > a")); //locations--footer
		driver.findElement(By.cssSelector("div#footerPanel> ul> li:nth-child(6) > a")); //forum--footer
		driver.findElement(By.cssSelector("div#footerPanel> ul> li > a[href='sitemap.htm']")); //sitemap--footer
		driver.findElement(By.cssSelector("div#footerPanel> ul> li > a[href='contact.htm']")); //contact us--footer
		driver.findElement(By.cssSelector("p[class='copyright']")); //parsoft all rights reserved
		driver.findElement(By.cssSelector("ul[class='visit'] > li:nth-child(1)")); //visit us at
		driver.findElement(By.cssSelector("ul[class='visit'] > li:nth-child(2)")); //www.parasoft.com
		
		
		
		
		
	}

}
