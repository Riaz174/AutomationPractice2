package Com.CucumberFrameWork.AutomationPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class FunctionOfActions {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository4\\AutomationPractice2\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //ChromeDriver class constructor
		driver.navigate().to("https:www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement signinField = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions action = new Actions(driver);// Created object for action class
		action.moveToElement(signinField).build().perform();
		Thread.sleep(3000);
		WebElement linked = driver.findElement(By.linkText("Music Library"));
		action.moveToElement(linked).click().build().perform();
		
	}

}
