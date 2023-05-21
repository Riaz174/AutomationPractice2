package Com.CucumberFrameWork.AutomationPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice2\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //ChromeDriver class constructor
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement alerts = driver.findElement(By.name("alert"));
		alerts.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement alert1 = driver.findElement(By.name("confirmation"));
		alert1.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement prompt = driver.findElement(By.name("prompt"));
		prompt.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Alert is displayed");
		driver.switchTo().alert().accept();
		
		
	}

}
