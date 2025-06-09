package Selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Selenium_Xpath_Locators {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.findElement(By.xpath("//img[@class='logo']")); 
		
		driver.findElement(By.xpath("//p[text()='Experience the difference']")); 
		driver.findElement(By.xpath("//li[contains(@class,'Solu')]"));  //solutions
		driver.findElement(By.xpath("//div[@id='headerPanel']//ul[@class='leftmenu']//li//a[@href='about.htm']"));  //About Us
		driver.findElement(By.xpath("//div[@id='headerPanel']//ul[@class='leftmenu']//li//a[starts-with(@href, 'serv')]"));  //services
		driver.findElement(By.xpath("//div[@id='headerPanel']//ul[@class='leftmenu']//li[4]//a]"));  //products
		driver.findElement(By.xpath("//div[@id='headerPanel']//ul[@class='leftmenu']//li[5]//a"));  //Locations
		driver.findElement(By.xpath("//div//ul//li//a[starts-with(@href,'admin')]"));  //Admin page
		driver.findElement(By.xpath("//div//ul[@class='button']//li//a[starts-with(@href,'index')]"));  //homebutton
		driver.findElement(By.xpath("//div//ul[@class='button']//li//a[contains(@href,'about')]"));  //about button
		driver.findElement(By.xpath("//div//ul[2]//li//a[contains(@href,'contact')]"));  //contact button
		driver.findElement(By.xpath("//div//h2[starts-with(text(),'Customer')]"));  //Customer login
		driver.findElement(By.xpath("//div//form//p//b[text()='Username']"));  //username
		driver.findElement(By.xpath("//input[@name='username']"));  //username textbox
		driver.findElement(By.xpath("//div[@id='loginPanel']//form//p[2]//b[text()='Password']"));  //password
		driver.findElement(By.xpath("//div[@class='login']//input[@name='password']"));  //password textbox
		driver.findElement(By.xpath("//div[@class='login']//input[@value='Log In']"));  //login button
		driver.findElement(By.xpath("//p//a[@href='lookup.htm']"));  //Forgot login info?
		driver.findElement(By.xpath("//p//a[@href='register.htm']"));  //register
		driver.findElement(By.xpath("//ul[@class='services']//li[text()='ATM Services']"));  //ATM Services
		driver.findElement(By.xpath("//ul[@class='services']//li//a[contains(text(),'Withdraw')]"));  //withdraw funds
		driver.findElement(By.xpath("//ul[@class='services']//li//a[text()='Transfer Funds']"));  //Transfer funds
		driver.findElement(By.xpath("//ul[@class='services']//li//a[starts-with(text(),'Check')]"));  //Check balances
		driver.findElement(By.xpath("//ul[@class='services']//li[5]//a"));  //make deposits
		driver.findElement(By.xpath("//ul[@class='servicestwo']//li[1]"));  //online services
		driver.findElement(By.xpath("//ul//li//a[text()='Bill Pay']"));  //Bill Pay
		driver.findElement(By.xpath("//ul[@class='servicestwo']//li[3]//a[contains(text(),'Account')]"));  //Account History
		driver.findElement(By.xpath("//ul[@class='servicestwo']//li//a[contains(text(),'Transfer')]"));  //Transfer Funds
		driver.findElement(By.xpath("//p[@class='more']//a[@href='services.htm']"));  //Read More
		driver.findElement(RelativeLocator.with(By.className("captionthree")).above(By.cssSelector("a[href='news.htm#6']"))); //date
		driver.findElement(By.xpath("//div[@id='rightPanel']//ul[@class='events']//a[@href='news.htm#6']")); //parabank is reopened
		driver.findElement(By.xpath("//div//ul//a[@href='news.htm#5']")); //new! online bill pay
		driver.findElement(By.xpath("//div[@id='rightPanel']//ul[@class='events']//li[4]")); //new! online account transfers
		driver.findElement(By.xpath("//a[@href='news.htm']")); //read more
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='Home']")); //Home--footer
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='About Us']")); //about us --footer
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li[3]//a")); //services --footer
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li[4]//a[text()='Products']")); //products --footer
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='Locations']")); //locations --footer
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[text()='Forum']")); //Forum --footer
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[contains(text(),'Site')]")); //sitemap --footer
		driver.findElement(By.xpath("//div[@id='footerPanel']//ul//li//a[contains(text(),'Con')]")); //contact us --footer
		driver.findElement(By.xpath("//p[@class='copyright']")); //copyright --footer
		driver.findElement(By.xpath("//ul[@class='visit']//li[starts-with(text(),'Visi')]")); //visit us at --footer
		driver.findElement(By.xpath("//ul[@class='visit']//li//a[starts-with(text(),'www')]")); //www.parasoft.com --footer
		

	}

}
