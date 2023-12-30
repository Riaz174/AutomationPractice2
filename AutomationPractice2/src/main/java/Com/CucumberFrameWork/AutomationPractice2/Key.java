package Com.CucumberFrameWork.AutomationPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository4\\AutomationPractice2\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //ChromeDriver class constructor
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement searchbx = driver.findElement(By.id("twotabsearchtextbox"));
		searchbx.sendKeys("computer");
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		searchbx.clear();
		Thread.sleep(6000);
		searchbx.click();
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		

	}

}
