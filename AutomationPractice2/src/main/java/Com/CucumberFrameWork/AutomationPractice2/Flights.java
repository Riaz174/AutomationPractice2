package Com.CucumberFrameWork.AutomationPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice2\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //ChromeDriver class constructor
		driver.navigate().to("https:www.expedia.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flights = driver.findElement(By.xpath("//*[text()='Flights']"));
		flights.click();
		Thread.sleep(6000);
		WebElement departure = driver.findElement(By.xpath("//*[@data-name='d1']"));
		departure.click();
		Thread.sleep(3000);
		WebElement departuredate = driver.findElement(By.xpath("//*[@aria-label='Jun 25, 2023']"));
		departuredate.click();
		Thread.sleep(3000);
		WebElement donefield =driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']"));
		donefield.click();
		Thread.sleep(3000);
		WebElement returndate = driver.findElement(By.id("d2-btn"));
		returndate.click();
		
	}

}
