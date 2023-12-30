package Com.CucumberFrameWork.AutomationPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository4\\AutomationPractice2\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //ChromeDriver class constructor
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchbx = driver.findElement(By.id("twotabsearchtextbox"));
		searchbx.sendKeys("computer");
		WebDriverWait sk = new WebDriverWait(driver,10);
		sk.until(ExpectedConditions.elementToBeClickable(searchbx));

	}

}
