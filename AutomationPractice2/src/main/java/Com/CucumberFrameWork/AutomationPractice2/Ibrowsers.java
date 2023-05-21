package Com.CucumberFrameWork.AutomationPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
	static WebDriver driver; //web driver Interface

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice2\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //ChromeDriver class constructor
		driver.navigate().to("https:www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signin.click();
		Thread.sleep(6000);
		WebElement emailField = driver.findElement(By.id("ap_email"));
		emailField.sendKeys("john@gmail.com");
		Thread.sleep(6000);
		WebElement continueField = driver.findElement(By.id("continue"));
		continueField.click();
		Thread.sleep(6000);
		WebElement passwordField = driver.findElement(By.id("ap_password"));
		passwordField.sendKeys("xyz123");
		Thread.sleep(6000);
		WebElement signinField = driver.findElement(By.id("signInSubmit"));
		signinField.click();
		Thread.sleep(6000);
		WebElement forgotpasswordField = driver.findElement(By.xpath("//*[contains(text(),'  Forgot your password?')]"));
		forgotpasswordField.click();
		
	}

}

