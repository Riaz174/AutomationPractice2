package Com.CucumberFrameWork.AutomationPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://protrainingtech.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement contact = driver.findElement(By.xpath("//a[@title='Contact']"));
		contact.click();
		Thread.sleep(3000);
		WebElement joinus = driver.findElement(By.xpath("//*[contains(text(),'Join us !')]"));
		joinus.click();
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.id("form-field-name"));
		fname.sendKeys("John");
		Thread.sleep(3000);
		WebElement lname = driver.findElement(By.id("form-field-field_6c5f814"));
		lname.sendKeys("Doe");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.id("form-field-email"));
		email.sendKeys("john@gmail.com");
		Thread.sleep(3000);
		//WebElement SDET = driver.findElement(By.xpath("//span[@class='current']"));
		//SDET.click();
		//Thread.sleep(3000);
		WebElement phoneField = driver.findElement(By.id("form-field-field_694d8a5"));
		phoneField.sendKeys("abcde");
		Thread.sleep(3000);
		WebElement registerButton = driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]"));
		registerButton.click();
		

	}

}
